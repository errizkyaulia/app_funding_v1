/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_funding_v1;

import Connection.ConnectionDatabase;
import Connection.ConnectionEmail;
import GUI.Loading;
import GUI.TestUI;
import java.sql.Connection;

/**
 *
 * @author Rizky
 */
public class App_funding_v1 {

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
            // TestUI UIFrame = new TestUI();
            // UIFrame.setVisible(true);
            // Menampilkan frame login
            loginFrame.setVisible(true);
            // loadingScreen.setVisible(true);
            // ConnectionEmail.checkConnection();
        }  
    }
}