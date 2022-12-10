/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.entity;

/**
 *
 * @author Putu Widyantara
 */
public class SnackDetail {
    private String id;
    private String size;
    private Integer price;
    private Integer stock;
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String getSize(){
        return this.size;
    }
    public void setSize(String size){
        this.size = size;
    }
    
    public Integer getPrice(){
        return price;
    }
    public void setPrice(Integer price){
        this.price = price;
    }
    
    public Integer getStock(){
        return stock;
    }
    public void setStock(Integer stock){
        this.stock = stock;
    }
}
