/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import Connection.ConnectionEmail;
import Hotel.ReservationMenu;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;
/**
 *
 * @author Rizky
 */
public class UserDashboard {

    // Load User 
    private static final Properties PROPS = new Properties();
    private static final String FILE_PATH = "Config/user.properties";

    static {
        try {
            PROPS.load(UserDashboard.class.getClassLoader().getResourceAsStream(FILE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void showWelcomeMessage() {
        // Menampilkan pesan "Welcome" menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Welcome to the User Dashboard!");
        new ReservationMenu().setVisible(true);
    }
    
}
