/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.view;
import movieapp.service.UserService;
/**
 *
 * @author Putu Widyantara
 */
public class UserView {
    private final UserService userService;
    public UserView(UserService userService){
        this.userService = userService;
    }
    public void showUser(){
        userService.showUser();
    }
}
