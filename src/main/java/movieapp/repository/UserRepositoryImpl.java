/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Putu Widyantara
 */
public class UserRepositoryImpl implements UserRepository {
    private final DataSource dataSource;
    public UserRepositoryImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    @Override
    public User[] getAll(){
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM user";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            
            while(resultSet.next()){
                User user = new User();
                user.setIdUser(resultSet.getInt("id_user"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setAccessLevel(resultSet.getInt("access_level"));
                list.add(user);
            }
            
            connection.close();
            statement.close();
            resultSet.close();
            
            return list.toArray(User[]::new);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Integer getAccessStatusByUsername(String username) {
        String sql = "SELECT `access_level` FROM user WHERE `username` = '" + username + "'";
        Integer result = 0;
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            
            while(resultSet.next()){
                result = resultSet.getInt("access_level");
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
    public User getUserByUsername(String username) {
        String sql = "SELECT * FROM user WHERE `username` = '" + username + "'";
        User user = new User();
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            
            while(resultSet.next()){
                user.setIdUser(resultSet.getInt("id_user"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setAccessLevel(resultSet.getInt("access_level"));
            }
            
            connection.close();
            statement.close();
            resultSet.close();
            
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return user;
    }

    @Override
    public Integer registerUser(String username, String password, Integer accessLevel) {
        Integer result = 0;
        String sql = "INSERT INTO `user` (`id_user`, `username`, `password`, `access_level`) VALUES (?, ?, ?, ?)";
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setInt(4, accessLevel);
            
            result = preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return result;
    }
}
