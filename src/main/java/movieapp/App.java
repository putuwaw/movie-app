/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package movieapp;

import movieapp.util.AppUtil;
import movieapp.view.HomePage;
/**
 *
 * @author Putu Widyantara
 */
public class App {

    public static void main(String[] args) {
        AppUtil.init();
        
        HomePage homePage = new HomePage();
        homePage.view();
    }
}
