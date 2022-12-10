/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.Film;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
/**
 *
 * @author Putu Widyantara
 */
public class FilmRepositoryImpl implements FilmRepository {
    private final DataSource dataSource;
    public FilmRepositoryImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public Film[] getAll() {
        List<Film> list = new ArrayList<>();
        String sql = "SELECT * FROM film";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                Film film = new Film();
                film.setId(resultSet.getString("id"));
                film.setIdStudio(resultSet.getString("id_studio"));
                film.setName(resultSet.getString("name"));
                film.setGenre(resultSet.getString("genre"));
                film.setStatus(resultSet.getString("status"));
                film.setPlot(resultSet.getString("plot"));
                film.setTrailer(resultSet.getString("trailer"));
                film.setDuration(resultSet.getInt("duration"));
                film.setPrice(resultSet.getInt("price"));
                film.setRating(resultSet.getDouble("rating"));
                list.add(film);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(Film[]::new);
            
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void updateRating(Film film) {
        String sql = "UPDATE film SET rating = ? WHERE id = ?";
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, film.getRating());
            preparedStatement.setString(2, film.getId());
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Film[] getPlayingMovie() {
        List<Film> list = new ArrayList<>();
        String sql = "SELECT * FROM film WHERE `status` = 'Playing'";
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()){
                Film film = new Film();
                film.setId(resultSet.getString("id"));
                film.setIdStudio(resultSet.getString("id_studio"));
                film.setName(resultSet.getString("name"));
                film.setGenre(resultSet.getString("genre"));
                film.setStatus(resultSet.getString("status"));
                film.setPlot(resultSet.getString("plot"));
                film.setTrailer(resultSet.getString("trailer"));
                film.setDuration(resultSet.getInt("duration"));
                film.setPrice(resultSet.getInt("price"));
                film.setRating(resultSet.getDouble("rating"));
                list.add(film);
            }
            connection.close();
            statement.close();
            resultSet.close();
            return list.toArray(Film[]::new);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }   
}
