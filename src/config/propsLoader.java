/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizky
 */
public class propsLoader {
    
    private static final Properties PROPS = new Properties();

    static {
        try {
            PROPS.load(propsLoader.class.getResourceAsStream("user.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Memuat Konfigurasi Pengguna", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String loadUser() {
        return PROPS.getProperty("User_Login");
    }

    public static String loadEmail(){
        return PROPS.getProperty("User_Email");
    }
    
    public static String loadPassword() {
        return PROPS.getProperty("password");
    }

    // Tambahkan metode lain untuk memuat properti lainnya sesuai kebutuhan
    
}