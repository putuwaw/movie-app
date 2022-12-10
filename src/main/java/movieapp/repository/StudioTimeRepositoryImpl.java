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
import javax.sql.DataSource;

/**
 *
 * @author Putu Widyantara
 */
public class StudioTimeRepositoryImpl implements StudioTimeRepository {
    private final DataSource dataSource;
    public StudioTimeRepositoryImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public Integer countAvailable(String idStudio, String time) {
        String sql = "SELECT COUNT(`studio_id`) FROM `studio_time` WHERE `studio_id` = '" + idStudio + "' AND `time` = '" + time +"' AND `status` = 'Available'";
        Integer result = 0;
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                result =  resultSet.getInt(1);
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
    public ArrayList<String> getListFilmTime(String idStudio) {
        ArrayList<String> result = new ArrayList<>();
        String sql = "SELECT DISTINCT(time) FROM `studio_time` WHERE `studio_id` = '" + idStudio + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String temp =  resultSet.getString("time");
                result.add(temp);
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
    public ArrayList<String> getAvailSeat(String idStudio, String time) {
        ArrayList<String> result = new ArrayList<>();
        String sql = "SELECT `status` FROM `studio_time` WHERE `studio_id` = '" + idStudio + "' AND `time` = '" + time + "'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String temp =  resultSet.getString("status");
                result.add(temp);
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
    public String getStudioName(String idStudio) {
        String result = "";
        String sql = "SELECT `name` FROM `studio` WHERE `id_studio` = '" + idStudio + "'";
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
