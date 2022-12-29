/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.service;

import movieapp.entity.User;
import movieapp.repository.UserRepository;
import java.util.Objects;
import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Putu Widyantara
 */
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @Override
    public void showUser(){
        User[] model = userRepository.getAll();
        System.out.println("LIST USER: ");
        for (User user: model){
            System.out.println(user.getIdUser() + ". " + user.getUsername() + " | " + user.getPassword());
        }
    }
    
    @Override
    public boolean checkLogin(String username, String password){
        User[] model = userRepository.getAll();
        for(User user: model){
            if (Objects.equals(username, user.getUsername())){
                String hashPassword = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();
                if (Objects.equals(hashPassword, user.getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkRegister(String username, String password1, String password2) {
        showUser();
        User[] model = userRepository.getAll();
        for(User user: model){
            if (Objects.equals(username, user.getUsername()) || Objects.equals(username, "")){
                return false;
            }else if ("".equals(password1) || (password1 == null ? password2 != null : !password1.equals(password2))){
                return false;
            }
        }
        return true;
    }

}
