/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import movieapp.entity.Transaction;

/**
 *
 * @author Putu Widyantara
 */
public class TransactionRepositoryImpl implements TransactionRepository {
    private final DataSource dataSource;
    public TransactionRepositoryImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    @Override
    public Integer insertTransaction(String idTransaction, String idUser, String idFilm, String date, Integer total) {
        Integer result = 0;
        String sql = "INSERT INTO `transaction` (`id_transaction`, `id_user`, `id_film`, `date`, `total`) VALUES (?, ?, ?, ?, ?);";
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, idTransaction);
            preparedStatement.setString(2, idUser);
            preparedStatement.setString(3, idFilm);
            preparedStatement.setString(4, date);
            preparedStatement.setInt(5, total);
            
            result = preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }

    @Override
    public Integer insertFilmTransaction(String idTransaction, String idFilm, String seat, String studioTime, Integer price, Integer count, Integer total) {
        Integer result = 0;
        String sql = "INSERT INTO `transaction_detail_film` (`id_transaction`, `id_film`, `seat`, `studio_time`, `price`, `count`, `total`) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, idTransaction);
            preparedStatement.setString(2, idFilm);
            preparedStatement.setString(3, seat);
            preparedStatement.setString(4, studioTime);
            preparedStatement.setInt(5, price);
            preparedStatement.setInt(6, count);
            preparedStatement.setInt(7, total);
            result = preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }

    @Override
    public Integer insertSnackTransaction(String idTransaction, String idSnack, String size, Integer count, Integer price, Integer total) {
        Integer result = 0;
        String sql = "INSERT INTO `transaction_detail_snack` (`id_transaction`, `id_snack`, `size`, `count`, `price`, `total`) VALUES (?, ?, ?, ?, ?, ?);";
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, idTransaction);
            preparedStatement.setString(2, idSnack);
            preparedStatement.setString(3, size);
            preparedStatement.setInt(4, count);
            preparedStatement.setInt(5, price);
            preparedStatement.setInt(6, total);
            result = preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }
    
}
