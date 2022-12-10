/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import movieapp.entity.Snack;

/**
 *
 * @author Putu Widyantara
 */
public class SnackRepositoryImpl implements SnackRepository {
    private final DataSource dataSource;
    public SnackRepositoryImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public Snack[] getTopThree() {
        List<Snack> list = new ArrayList<>();
        String sql = "SELECT * FROM `snack` LIMIT 3";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                Snack snack = new Snack();
                snack.setId(resultSet.getString("id_snack"));
                snack.setName(resultSet.getString("name"));
                snack.setDesc(resultSet.getString("desc"));
                list.add(snack);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(Snack[]::new);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Snack[] getSnack() {
        List<Snack> list = new ArrayList<>();
        String sql = "SELECT * FROM `snack`";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                Snack snack = new Snack();
                snack.setId(resultSet.getString("id_snack"));
                snack.setName(resultSet.getString("name"));
                snack.setDesc(resultSet.getString("desc"));
                list.add(snack);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(Snack[]::new);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public String getNameById(String id) {
        String result = "";
        String sql = "SELECT `name` FROM `snack` WHERE `id_snack` = '" + id + "'";
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
