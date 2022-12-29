/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.Transaction;
import movieapp.entity.FilmTransaction;
import movieapp.entity.SnackTransaction;
/**
 *
 * @author Putu Widyantara
 */
public interface TransactionRepository {
    Integer insertTransaction(String idTransaction, String idUser, String idFilm, String date, Integer total);
    Integer insertFilmTransaction(String idTransaction, String idFilm, String seat, String studioTime, Integer price, Integer count, Integer total);
    Integer insertSnackTransaction(String idTransaction, String idSnack, String size, Integer count, Integer price, Integer total);
    Transaction[] getAll();
    FilmTransaction[] getAllFilmByTransaction(String idTransaction);
    SnackTransaction[] getAllSnackByTransaction(String idTransaction);
    
    String getFilmNameById(String idFilm);
    String getSnackNameById(String idSnack);
    String getStudioNameByIdFilm(String idFilm);
}
