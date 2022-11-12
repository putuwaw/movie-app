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
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        System.out.println(result);
        return result;
    }
}
