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
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import movieapp.entity.Transaction;
import movieapp.entity.FilmTransaction;
import movieapp.entity.SnackTransaction;

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

    @Override
    public Transaction[] getAll() {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transaction";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                Transaction transaction = new Transaction();
                transaction.setIdTransaction(resultSet.getString("id_transaction"));
                transaction.setIdUser(resultSet.getString("id_user"));
                transaction.setIdFilm(resultSet.getString("id_film"));
                transaction.setDate(resultSet.getString("date"));
                transaction.setTotal(resultSet.getInt("total"));
                list.add(transaction);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(Transaction[]::new);
            
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public FilmTransaction[] getAllFilmByTransaction(String idTransaction) {
        List<FilmTransaction> list = new ArrayList<>();
        String sql = "SELECT * FROM `transaction_detail_film` WHERE `id_transaction` = '" + idTransaction + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                FilmTransaction ft = new FilmTransaction();
                ft.setIdTransaction(resultSet.getString("id_transaction"));
                ft.setIdFilm(resultSet.getString("id_film"));
                ft.setSeat(resultSet.getString("seat"));
                ft.setStudioTime(resultSet.getString("studio_time"));
                ft.setPrice(resultSet.getInt("price"));
                ft.setCount(resultSet.getInt("count"));
                ft.setTotal(resultSet.getInt("total"));
                list.add(ft);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(FilmTransaction[]::new);
            
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public SnackTransaction[] getAllSnackByTransaction(String idTransaction) {
        List<SnackTransaction> list = new ArrayList<>();
        String sql = "SELECT * FROM `transaction_detail_snack` WHERE `id_transaction` = '" + idTransaction + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                SnackTransaction st = new SnackTransaction();
                st.setIdTransaction(resultSet.getString("id_transaction"));
                st.setIdSnack(resultSet.getString("id_snack"));
                st.setSize(resultSet.getString("size"));
                st.setCount(resultSet.getInt("count"));
                st.setPrice(resultSet.getInt("price"));
                st.setTotal(resultSet.getInt("total"));
                list.add(st);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(SnackTransaction[]::new);
            
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public String getFilmNameById(String idFilm) {
        String result = "";
        String sql = "SELECT `name` FROM `film` WHERE `id` = '" + idFilm + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                result =  resultSet.getString("name");
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }

    @Override
    public String getSnackNameById(String idSnack) {
        String result = "";
        String sql = "SELECT `name` FROM `snack` WHERE `id_snack` = '" + idSnack + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                result =  resultSet.getString("name");
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }

    @Override
    public String getStudioNameByIdFilm(String idFilm) {
        String result = "";
        String sql = "SELECT film.id, studio.name FROM film LEFT JOIN studio ON film.id_studio = studio.id_studio WHERE film.id = '" + idFilm + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                result =  resultSet.getString("name");
            }
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }
}
