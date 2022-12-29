/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.entity;

/**
 *
 * @author Putu Widyantara
 */
public class SnackTransaction {
    private String idTransaction;
    private String idSnack;
    private String size;
    private Integer count;
    private Integer price;
    private Integer total;
    
    public String getIdTransaction(){
        return idTransaction;
    }
    public void setIdTransaction(String idTransaction){
        this.idTransaction = idTransaction;
    }
    
    public String getIdSnack(){
        return idSnack;
    }
    public void setIdSnack(String idSnack){
        this.idSnack = idSnack;
    }
    
    public String getSize(){
        return size;
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
