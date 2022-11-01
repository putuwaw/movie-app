/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieapp.service;

import movieapp.util.AppUtil;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Putu Widyantara
 */
public class UserServiceImplTest {
    @BeforeEach
    void setup(){
        AppUtil.init();
    }

    @Test
    void testLogin(){
        assertFalse(AppUtil.getUserService().checkLogin("admin", "password"));
    }
}
