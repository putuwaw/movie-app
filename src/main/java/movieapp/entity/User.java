/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.entity;

/**
 *
 * @author Putu Widyantara
 */
public class User {
    private Integer idUser; 
    private String username;
    private String password;
    private Integer accessLevel;
    
    public Integer getIdUser(){
        return this.idUser;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public Integer getAccessLevel(){
        return this.accessLevel;
    }
    
    public void setIdUser(Integer idUser){
        this.idUser = idUser;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setAccessLevel(Integer accessLevel){
        this.accessLevel = accessLevel;
    }
}
