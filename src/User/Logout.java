/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizky
 */
public class Logout {
    private static final Properties PROPS = new Properties();
    static {
        try {
            PROPS.load(Logout.class.getClassLoader().getResourceAsStream("Config/user.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Memuat Konfigurasi Pengguna", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeUser(){
        PROPS.remove("User_Login");
        PROPS.remove("User_LoginTime");
        JOptionPane.showMessageDialog(null, "Berhasil Keluar", "Successful Logout", JOptionPane.INFORMATION_MESSAGE);
    }
}
