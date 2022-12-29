/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package movieapp;

import javax.swing.UIManager;
import movieapp.util.AppUtil;
import movieapp.view.Login;
/**
 *
 * @author Putu Widyantara
 */
public class App {

    public static void main(String[] args) {
        AppUtil.init();
        // AppUtil.getFilmService().updateFilm();
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ignored){}
        
        Login login = new Login();
        login.view();
    }
}
