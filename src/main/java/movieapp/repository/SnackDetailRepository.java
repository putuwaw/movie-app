/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movieapp.repository;

import movieapp.entity.SnackDetail;

/**
 *
 * @author Putu Widyantara
 */
public interface SnackDetailRepository {
    SnackDetail[] getAll();
    Integer getPriceByIdSize(String id, String size);
    Integer getStockByIdSize(String id, String size);
}
