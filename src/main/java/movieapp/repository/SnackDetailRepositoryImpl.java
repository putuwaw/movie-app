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
import movieapp.entity.SnackDetail;

/**
 *
 * @author Putu Widyantara
 */
public class SnackDetailRepositoryImpl implements SnackDetailRepository {
    private final DataSource dataSource;
    public SnackDetailRepositoryImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    @Override
    public SnackDetail[] getAll() {
        List<SnackDetail> list = new ArrayList<>();
        String sql = "SELECT * FROM `snack_detail`";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                SnackDetail snackDetail = new SnackDetail();
                snackDetail.setId(resultSet.getString("id_snack"));
                snackDetail.setSize(resultSet.getString("size"));
                snackDetail.setPrice(resultSet.getInt("price"));
                snackDetail.setStock(resultSet.getInt("stock"));
                list.add(snackDetail);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(SnackDetail[]::new);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Integer getPriceByIdSize(String id, String size) {
        Integer result = 0;
        String sql = "SELECT `price` FROM `snack_detail` WHERE `id_snack` = '" + id + "' AND `size` = '" + size + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                result =  resultSet.getInt("price");
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
    public Integer getStockByIdSize(String id, String size) {
        Integer result = 0;
        String sql = "SELECT `stock` FROM `snack_detail` WHERE `id_snack` = '" + id + "' AND `size` = '" + size + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                result =  resultSet.getInt("stock");
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
    public Integer setDecreaceStock(String id, String size) {
        Integer result = 0;
        Integer currStock = getStockByIdSize(id, size);
        currStock--;
        String sql = "UPDATE `snack_detail` SET `stock` = ? WHERE `id_snack` = ? AND `size` = ?";

            try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, currStock);
                preparedStatement.setString(2, id);
                preparedStatement.setString(3, size);

                result = preparedStatement.executeUpdate();
                
                connection.close();
                preparedStatement.close();
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        return result;
    }

    @Override
    public Integer setUpdateStock(String id, String size, Integer update) {
        Integer result = 0;
        String sql = "UPDATE `snack_detail` SET `stock` = ? WHERE `id_snack` = ? AND `size` = ?";
            try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, update);
                preparedStatement.setString(2, id);
                preparedStatement.setString(3, size);

                result = preparedStatement.executeUpdate();
                
                connection.close();
                preparedStatement.close();
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        return result;
    }
}
