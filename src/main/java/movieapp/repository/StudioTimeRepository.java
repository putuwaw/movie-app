/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

/**
 *
 * @author Putu Widyantara
 */
public interface StudioTimeRepository {
    Integer countAvailable(String idStudio, String time);
}
