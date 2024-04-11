/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;
import Connection.ConnectionDatabase;
import GUI.Loading;
import User.UserDashboard;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;


/**
 *
 * @author Rizky
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        forgotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Username/Email");

        jLabel2.setText("Password");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Signup Here");

        signupButton.setText("Signup");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Forgot your password?");

        forgotButton.setText("I'm Forgot");
        forgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signupButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(forgotButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(forgotButton))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(signupButton))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int loginAttempts = 0;
    private static final int MAX_LOGIN_ATTEMPTS = 3;
    private static final Properties PROPS = new Properties();
    private static final String FILE_PATH = "D:\\4 ISA 1\\Project\\Booking_Hotel\\src\\config\\user.properties";
    
    static {
        try {
            PROPS.load(Login.class.getClassLoader().getResourceAsStream("Config/user.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        
        // Connect into database and fetching user data
        ConnectionDatabase database = new ConnectionDatabase();
        Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database
        
        // Menampilkan Loading UI
        Loading loadingScreen = new Loading();
        loadingScreen.setVisible(true);
        
        // Cek Koneksi
        if (conn != null){ // Koneksi Aman
            // Masukan Input User
            String usernameEmail = usernameTextField.getText(); // Mendapatkan username/email dari field teks
            String password = new String(passwordField.getPassword()); // Mendapatkan password dari field kata sandi

            // Validasi Login
            if (isLoginValid(conn, usernameEmail, password)) { // Jika login berhasil
                // Save Login Info
                saveUser(usernameEmail);
                
                // Menghilangkan Loading Screen
                loadingScreen.dispose();
                
                // Membuat objek UserDashboard dan menampilkannya
                UserDashboard userDashboard = new UserDashboard();
                userDashboard.showWelcomeMessage();

                // Menyembunyikan frame login saat ini jika diperlukan
                this.setVisible(false);
            } else {
                // Counter gagal login
                loginAttempts++;
                if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
                    loadingScreen.dispose();
                    JOptionPane.showMessageDialog(null, "Anda telah melebihi batas percobaan login.");
                    setCooldownTimer();
                } else {
                    loadingScreen.dispose();
                    JOptionPane.showMessageDialog(null, "Belum berhasil Login. Percobaan login ke-" + loginAttempts);
                }
            }
        } else { // Koneksi GAGAL
            // Logika untuk menangani kasus koneksi gagal
            loadingScreen.dispose();
            JOptionPane.showMessageDialog(null, "Gagal Terhubung, Periksa Koneksi Anda");
        }
        
        loadingScreen.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    // Metode untuk memverifikasi password
    private boolean verifyPassword(String password, String storedPassword) {
        // Gunakan BCrypt.checkpw() untuk memverifikasi password
        return BCrypt.checkpw(password, storedPassword);
    }
    
    // Metode untuk Validasi Login
    private boolean isLoginValid(Connection conn, String usernameEmail, String password) {
        if (!cekCooldownTimer()) {
            return false;
        }
        
        // Query mencari akun
        String query = "SELECT * FROM user WHERE (username = ? OR email = ?) LIMIT 1";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, usernameEmail);
            pstmt.setString(2, usernameEmail);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) { // Akun terdaftar
                // Cek Password
                String storedPassword = rs.getString("password");
                if (verifyPassword(password, storedPassword)){
                    return isAccountActive(conn, usernameEmail); // Cek Akun aktif
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                    return false;
                }
            } else {
                return false; // Username/email tidak ditemukan
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Log pesan kesalahan
            return false;
        }
    }
    
    // Metode Cek Akun Aktif
    private boolean isAccountActive(Connection conn, String usernameEmail){
        String accountstate = "ACTIVE";
        String query = "SELECT * FROM user WHERE (username = ? OR email = ?) AND accountstate = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, usernameEmail);
            pstmt.setString(2, usernameEmail);
            pstmt.setString(3, accountstate);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                return true; // Jika terdapat data akun aktif return true
            } else {
                JOptionPane.showMessageDialog(this, "Akun Tidak Aktif", "Failed Login", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Log pesan kesalahan
            return false;
        }
    }
    
    // Metode untuk mendapatkan tanggal dan waktu saat ini dalam format yang diinginkan
    private static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
    
    // Metode untuk menyimpan data pengguna ke dalam file user.properties
    public static void saveUser(String username) {
        try {
            String loginTime = getCurrentDateTime();
            PROPS.setProperty("User_Login", username);
            PROPS.setProperty("User_LoginTime", loginTime);
            PROPS.store(new FileOutputStream(FILE_PATH), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Metode untuk menyimpan Cooldown Login Timer
    public static void setCooldownTimer(){
        try {
            String loginTime = getCurrentDateTime();
            PROPS.setProperty("User_FailedLoginTimer", loginTime);
            PROPS.store(new FileOutputStream(FILE_PATH), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Metode untuk cek Cooldown Timer
    private boolean cekCooldownTimer(){
        // Format string tanggal dan waktu
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String failedLoginTime = PROPS.getProperty("User_FailedLoginTimer");
        if (failedLoginTime != null) {
            // Parse string menjadi objek Date
            try {
                Date date = sdf.parse(failedLoginTime);
                // Waktu saat ini
                Date now = new Date();
                // Hitung selisih waktu dalam milidetik
                long diffInMillies = now.getTime() - date.getTime();
                // Konversi milidetik ke menit
                long diffInMinutes = diffInMillies / (60 * 1000);

                if (diffInMinutes > 5) {
                    // Reset properti User_FailedLoginTimer
                    PROPS.remove("User_FailedLoginTimer");
                    return true;
                } else {
                    long remainingTime = 5 - diffInMinutes;
                    JOptionPane.showMessageDialog(this, "Cooldown Aktif. Sisa waktu: " + remainingTime + " menit", "Failed Login", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Cooldown timer still active.");
                }
            } catch (ParseException e) {
                // Tangkap pengecualian jika parsing gagal
                e.printStackTrace();
            }
        } else {
            // Tangani kasus di mana properti tidak ditemukan
            System.out.println("User_FailedLoginTimer property is not found.");
            return true;
        }
        return false;
    }
    
    // Membuka Form Signup
    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        Signup signupFrame = new Signup();
        signupFrame.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_signupButtonActionPerformed

    // Membuka Form Lupa Password
    private void forgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotButtonActionPerformed
        // TODO add your handling code here:
        Forgot forgotFrame = new Forgot();
        forgotFrame.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_forgotButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

}
