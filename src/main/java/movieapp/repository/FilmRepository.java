/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.Film;

/**
 *
 * @author Putu Widyantara
 */
public interface FilmRepository {
    Film[] getAll();
    Film[] getPlayingMovie();
    void updateRating(Film film);
}
