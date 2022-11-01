/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.util;

import javax.sql.DataSource;
import movieapp.repository.UserRepository;
import movieapp.repository.UserRepositoryImpl;
import movieapp.service.UserService;
import movieapp.service.UserServiceImpl;
import movieapp.view.UserView;
/**
 *
 * @author Putu Widyantara
 */
public class AppUtil {
    private static DataSource dataSource;
    
    private static UserRepository userRepository;
    private static UserService userService;
    private static UserView userView;
        
    public static void init(){
        dataSource = DatabaseUtil.getDataSource();
        
        userRepository = new UserRepositoryImpl(dataSource);
        userService = new UserServiceImpl(userRepository);
        userView = new UserView(userService);
    }
    
    public static DataSource getDataSource(){
        return dataSource;
    }
    public static UserRepository getUserRepository(){
        return userRepository;
    }
    public static UserService getUserService(){
        return userService;
    }
    public static UserView getUserView(){
        return userView;
    }
}
