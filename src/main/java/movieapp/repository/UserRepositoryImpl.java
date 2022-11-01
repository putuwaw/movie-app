/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.User;
import java.sql.Connection;
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
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                list.add(user);
            }
            return list.toArray(User[]::new);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
