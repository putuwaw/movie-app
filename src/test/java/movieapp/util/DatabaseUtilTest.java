/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package movieapp.util;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseUtilTest {
    @Test
    void testConnection() throws SQLException {
        try (HikariDataSource dataSource = DatabaseUtil.getDataSource()) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
    }
}