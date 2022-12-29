/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.User;

/**
 *
 * @author Putu Widyantara
 */
public interface UserRepository {
    User[] getAll();
    Integer getAccessStatusByUsername(String username);
    User getUserByUsername(String username);
    Integer registerUser(String username, String password, Integer accessLevel);
}
