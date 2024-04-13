/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Connection.ConnectionDatabase;
import GUI.Loading;
import User.UserDashboard;
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
        return user != null;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Menampilkan Loading Screen
        Loading loadingScreen = new Loading();
        loadingScreen.setVisible(true);
        
        // Connect into database and fetching user data
        ConnectionDatabase database = new ConnectionDatabase();
        Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database

        // Melakukan pengecekan apakah koneksi berhasil
        if (conn != null) { // setelah koneksi berhasil
            System.out.println("Database connection successful.");

            if (cekUserLogin()){
                // Membuat objek UserDashboard dan menampilkannya
                UserDashboard userDashboard = new UserDashboard();
                userDashboard.showWelcomeMessage();
            } else {
                // Tampilkan menu reservasi
                new ReservationMenu().setVisible(true);
            }
        }
        
        // Menghilangkan Loading Screen
        loadingScreen.dispose();
    }
}