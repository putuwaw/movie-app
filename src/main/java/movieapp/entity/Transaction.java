/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.entity;

/**
 *
 * @author Putu Widyantara
 */
public class Transaction {
    private String idTransaction;
    private String idUser;
    private String idFilm;
    private String date;
    private Integer total;
    
    public String getIdTransaction(){
        return idTransaction;
    }
    public void setIdTransaction(String idTransaction){
        this.idTransaction = idTransaction;
    }
    
    public String getIdUser(){
        return idUser;
    }
    public void setIdUser(String idUser){
        this.idUser = idUser;
    }
    
    public String getIdFilm(){
        return idFilm;
    }
    public void setIdFilm(String idFilm){
        this.idFilm = idFilm;
    }
    
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    
    public Integer getTotal(){
        return total;
    }
    public void setTotal(Integer total){
        this.total = total;
    }
}
