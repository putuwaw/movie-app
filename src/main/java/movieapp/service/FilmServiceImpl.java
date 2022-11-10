/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.service;

import movieapp.entity.Film;
import movieapp.repository.FilmRepository;

import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Putu Widyantara
 */
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;
    
    public FilmServiceImpl(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }
    @Override
    public void showFilm() {
        Film[] model = filmRepository.getAll();
        System.out.println("LIST FILM: ");
        for (Film film: model){
            System.out.println(film.getId() + " | " + film.getName() + " | " + film.getRating());
        }
    }
    
    @Override
    public void showPlayingFilm(){
        Film[] model = filmRepository.getPlayingMovie();
        System.out.println("LIST FILM: ");
        for (Film film: model){
            System.out.println(film.getId());
        }
    }

    @Override
    public void updateFilm() {
        showFilm();
        String charset = "UTF-8";
        Film[] model = filmRepository.getAll();
        System.out.println("LIST FILM: ");
        for (Film film: model){
            String parameter = "";
            try {
                parameter = String.format("tconst=%s",URLEncoder.encode(film.getId(), charset));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(FilmServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            HttpResponse <JsonNode> response = null;
            try {
                response = Unirest.get(System.getenv("API_ENDPOINT") + "?" +  parameter)
                        .header("X-RapidAPI-Host", System.getenv("X_RAPIDAPI_HOST"))
                        .header("X-RapidAPI-Key", System.getenv("X_RAPIDAPI_KEY"))
                        .asJson();
            } catch (UnirestException ex) {
                Logger.getLogger(FilmServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            Double rating = response.getBody().getObject().getDouble("rating");
            film.setRating(rating);
            filmRepository.updateRating(film);
        }
        showFilm();
    }
}
