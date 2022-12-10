/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.Snack;

/**
 *
 * @author Putu Widyantara
 */
public interface SnackRepository {
    Snack[] getTopThree();
    Snack[] getSnack();
    String getNameById(String id);
}
