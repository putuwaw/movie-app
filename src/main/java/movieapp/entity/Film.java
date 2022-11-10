/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.entity;

/**
 *
 * @author Putu Widyantara
 */
public class Film {
    private String id;
    private String id_studio;
    private String name;
    private String genre;
    private String status;
    private String plot;
    private String trailer;
    private Integer duration;
    private Integer price;
    private Double rating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdStudio() {
        return id_studio;
    }

    public void setIdStudio(String idStudio) {
        this.id_studio = idStudio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
    
    public String getTrailer(){
        return trailer;
    }
    
    public void setTrailer(String trailer){
        this.trailer = trailer;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Double getRating(){
        return rating;
    }
    public void setRating(Double rating){
        this.rating = rating;
    }
}
