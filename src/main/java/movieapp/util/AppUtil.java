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
import movieapp.repository.FilmRepository;
import movieapp.repository.FilmRepositoryImpl;
import movieapp.repository.SnackRepository;
import movieapp.repository.SnackRepositoryImpl;
import movieapp.service.FilmService;
import movieapp.service.FilmServiceImpl;
import movieapp.view.UserView;
import movieapp.repository.StudioTimeRepository;
import movieapp.repository.StudioTimeRepositoryImpl;

/**
 *
 * @author Putu Widyantara
 */
public class AppUtil {
    private static DataSource dataSource;
    
    private static UserRepository userRepository;
    private static UserService userService;
    private static UserView userView;
    
    private static FilmRepository filmRepository;
    private static FilmService filmService;
    
    private static StudioTimeRepository studioTimeRepository;
    
    private static SnackRepository snackRepository;
    
    public static void init(){
        dataSource = DatabaseUtil.getDataSource();
        
        userRepository = new UserRepositoryImpl(dataSource);
        userService = new UserServiceImpl(userRepository);
        userView = new UserView(userService);
        
        filmRepository = new FilmRepositoryImpl(dataSource);
        filmService = new FilmServiceImpl(filmRepository);
        
        studioTimeRepository = new StudioTimeRepositoryImpl(dataSource);
        
        snackRepository = new SnackRepositoryImpl(dataSource);
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
    
    public static FilmRepository getFilmRepository(){
        return filmRepository;
    }
    public static FilmService getFilmService(){
        return filmService;
    }
    
    public static StudioTimeRepository getStudioTimeRepository(){
        return studioTimeRepository;
    }
    public static SnackRepository getSnackRepository(){
        return snackRepository;
    }
}
