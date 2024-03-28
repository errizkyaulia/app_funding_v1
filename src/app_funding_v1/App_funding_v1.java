/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_funding_v1;
import Connection.ConnectionSignup;
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
        // Membuat objek untuk frame login
        //Login loginFrame = new Login();
        
        // Menampilkan frame login
        //loginFrame.setVisible(true);
        
        // Membuat objek ConnectionSignup
        ConnectionSignup signup = new ConnectionSignup();
        
        // Memanggil metode connect untuk membuat koneksi ke database
        Connection conn = signup.connect();
        
        // Melakukan pengecekan apakah koneksi berhasil
        if (conn != null) {
            System.out.println("Database connection successful.");
            // Tambahkan logika aplikasi Anda di sini setelah koneksi berhasil
        } else {
            System.out.println("Database connection failed.");
            // Tambahkan logika untuk menangani kasus koneksi gagal di sini
        }
    }
    
}