/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

import java.util.ArrayList;

/**
 *
 * @author Putu Widyantara
 */
public interface StudioTimeRepository {
    Integer countAvailable(String idStudio, String time);
    ArrayList<String> getListFilmTime(String idStudio);
    ArrayList<String> getAvailSeat(String idStudio, String time);
    String getStudioName(String idStudio);
    Integer setNotAvailChair(String idStudio, String time, ArrayList<String> chair);
}
