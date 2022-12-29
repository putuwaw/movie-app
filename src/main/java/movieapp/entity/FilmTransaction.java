/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.entity;

/**
 *
 * @author Putu Widyantara
 */
public class FilmTransaction {
    private String idTransaction;
    private String idFilm;
    private String seat;
    private String studioTime;
    private Integer price;
    private Integer count;
    private Integer total;
    
    public String getIdTransaction(){
        return idTransaction;
    }
    public void setIdTransaction(String idTransaction){
        this.idTransaction = idTransaction;
    }
    
    public String getIdFilm(){
        return idFilm;
    }
    public void setIdFilm(String idFilm){
        this.idFilm = idFilm;
    }
    
    public String getSeat(){
        return seat;
    }
    public void setSeat(String seat){
        this.seat = seat;
    }
    
    public String getStudioTime(){
        return studioTime;
    }
    public void setStudioTime(String studioTime){
        this.studioTime = studioTime;
    }
    
    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price){
        this.price = price;
    }
    
    public Integer getCount(){
        return count;
    }
    public void setCount(Integer count){
        this.count = count;
    }
    
    public Integer getTotal(){
        return total;
    }
    public void setTotal(Integer total){
        this.total = total;
    }
}
