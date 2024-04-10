/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Connection.ConnectionDatabase;
import Connection.ConnectionEmail;
import GUI.Loading;
import GUI.Loading;
import java.sql.Connection;

/**
 *
 * @author Rizky
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Connect into database and fetching user data
        ConnectionDatabase database = new ConnectionDatabase();
        Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database
        
        // Melakukan pengecekan apakah koneksi berhasil
        if (conn != null) {
            System.out.println("Database connection successful.");
            // Tambahkan logika aplikasi Anda di sini setelah koneksi berhasil
            // Membuat objek untuk frame login
            Login loginFrame = new Login();
            Loading loadingScreen = new Loading();
            
            ReservationMenu bookingFrame = new ReservationMenu();
            
            bookingFrame.setVisible(true);
            
            // Loading UIFrame = new Loading();
            // UIFrame.setVisible(true);
            // Menampilkan frame login
            // loginFrame.setVisible(true);
            // loadingScreen.setVisible(true);
            // ConnectionEmail.checkConnection();
        }  
    }
}