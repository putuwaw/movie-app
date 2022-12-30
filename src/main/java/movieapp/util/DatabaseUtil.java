/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author Putu Widyantara
 */
public class DatabaseUtil {
    private static final HikariDataSource hikariDataSource;
    static{
        HikariConfig configuration = new HikariConfig();
        configuration.setDriverClassName("com.mysql.cj.jdbc.Driver");
        configuration.setUsername(System.getenv("DB_USERNAME"));
        configuration.setPassword(System.getenv("DB_PASSWORD"));
        configuration.setJdbcUrl("jdbc:mysql://" + System.getenv("DB_ADDRESS") + System.getenv("DB_NAME"));

        // configuration.setUsername(System.getenv("DB_USERNAME_LOCAL"));
        // configuration.setPassword(System.getenv("DB_PASSWORD_LOCAL"));
        // configuration.setJdbcUrl("jdbc:mysql://" + System.getenv("DB_ADDRESS_LOCAL") + System.getenv("DB_NAME_LOCAL"));
        
        hikariDataSource = new HikariDataSource(configuration);
    }
    public static HikariDataSource getDataSource(){
        return hikariDataSource;
    }
}
