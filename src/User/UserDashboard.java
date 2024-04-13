/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import Hotel.ReservationMenu;
import java.io.IOException;
import java.util.Properties;
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
        // Buka Reservasi User
        new MyReservation().setVisible(true);
    }
    
}
