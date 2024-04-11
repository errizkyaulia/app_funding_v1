/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Connection.ConnectionDatabase;
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
        // Menampilkan Loading Screen
        Loading loadingScreen = new Loading();
        loadingScreen.setVisible(true);
        
        // Connect into database and fetching user data
        ConnectionDatabase database = new ConnectionDatabase();
        Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database

        // Melakukan pengecekan apakah koneksi berhasil
        if (conn != null) { // setelah koneksi berhasil
            System.out.println("Database connection successful.");

            // Membuat objek untuk frame login
            new Login().setVisible(true);
            
            //new ReservationMenu().setVisible(true);
        }
        
        // Menghilangkan Loading Screen
        loadingScreen.dispose();
    }
}