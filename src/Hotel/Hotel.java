/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Admin.AdminPanel;
import Connection.ConnectionDatabase;
import User.ReservationMenu;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizky
 */
public class Hotel {

    private static final Properties PROPS = new Properties();
    static {
        try {
            PROPS.load(Hotel.class.getClassLoader().getResourceAsStream("Config/user.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal Memuat Konfigurasi Pengguna", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Metode Apakah User sudah pernah Login
    private static boolean cekUserLogin(){
        String user = PROPS.getProperty("User_Login");
        String lastLogin = PROPS.getProperty("User_LoginTime");
        return user != null;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Connect into database and fetching user data
        ConnectionDatabase database = new ConnectionDatabase();
        Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database

        // ConnectionEmail.checkConnection();
        // Melakukan pengecekan apakah koneksi berhasil
        if (conn != null) { // setelah koneksi berhasil
            System.out.println("Database connection successful.");

            if (cekUserLogin()){
                // Membuat objek UserDashboard dan menampilkannya
                new ReservationMenu().setVisible(true);
            } else {
                // Tampilkan menu Login
                //new Login().setVisible(true);
            }
        }
         //new AdminPanel().setVisible(true);
    }
}