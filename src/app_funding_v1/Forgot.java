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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Rizky
 */
public class Forgot extends javax.swing.JFrame {

    /**
     * Creates new form Forgot
     */
    public Forgot() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameForgotTextField = new javax.swing.JTextField();
        emailForgotTextField = new javax.swing.JTextField();
        phonenumberForgotTextField = new javax.swing.JTextField();
        requestForgotButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        loadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Password");

        jLabel1.setText("Choose one of this method you still remember:");

        jLabel2.setText("Username");

        jLabel3.setText("Email");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Back to Login");

        requestForgotButton.setText("Request Recovery Account");
        requestForgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestForgotButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("OTP will be send to your email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(loginButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usernameForgotTextField)
                                            .addComponent(emailForgotTextField)
                                            .addComponent(phonenumberForgotTextField)
                                            .addComponent(requestForgotButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadingLabel)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameForgotTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailForgotTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phonenumberForgotTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestForgotButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(loginButton))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void requestForgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestForgotButtonActionPerformed
        // TODO add your handling code here:
        // Connect into database and fetching user data
        ConnectionDatabase database = new ConnectionDatabase();
        Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database
        
        // Terima input user
        String username = usernameForgotTextField.getText();
        String email = emailForgotTextField.getText();
        String phonenumber = phonenumberForgotTextField.getText();
        
        // Loading Screen
        Loading loadingScreen = new Loading();
        
        // Cek Koneksi
        if (conn != null){
            // Call Loading Screen
            this.setVisible(false);
            // loadingScreen.setVisible(true);
            loadingLabel.getIcon();
            TestUI UIFrame = new TestUI();
            UIFrame.setVisible(true);
            
            JOptionPane.showMessageDialog(this, "Request Anda Sedang DI Proses", "Proccessing Request", JOptionPane.ERROR_MESSAGE);
            //Cek User
            if (cekUser(conn, username, email, phonenumber)){
                // Close the loading screen after the process is finished
                UIFrame.dispose();
                // loadingScreen.dispose();
                return;
            }
        }
        // Close the loading screen after the process is finished
        // loadingScreen.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_requestForgotButtonActionPerformed

    private boolean cekUser(Connection conn, String username, String email, String phonenumber) {
        String query = "SELECT * FROM user WHERE username = ? OR email = ? OR phonenumber = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, phonenumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) { // Check if any result found
                // OTP
                String emailOTP = rs.getString("email");
                String OTP = generateOTP();
                
                // Masukan OTP ke Database
                if (otpInsert(conn, emailOTP, OTP)){
                    // Mengirimkan Email Verifikasi
                    ConnectionEmail emailSender = new ConnectionEmail();
                    String emailSubject = "One-Time Password (OTP)";
                    String emailBody = "Kode OTP Anda: " + OTP;
                    
                    // Sending Email and give the return
                    if(emailSender.sendEmail(emailOTP, emailSubject, emailBody)){
                        // Masuk ke dalam OTP
                        OTP otpFrame = new OTP();
                        otpFrame.setVisible(true);
                        otpFrame.emailLabel.setText(emailOTP);
                        this.setVisible(false);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal mengirim Email");
                        return false;
                    }         
                } else {
                    JOptionPane.showMessageDialog(null, "OTP gagal tersimpan!");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found!");
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            return false;
        }
    }

    
    // Metode Generate OTP
    public static String generateOTP(){
        // Inisialisasi objek Random
        Random random = new Random();
        
        // Generate angka acak antara 100000 dan 999999
        int otpNumber = random.nextInt(900000) + 100000;
        
        // Konversi angka menjadi string
        String OTP = String.valueOf(otpNumber);
        
        // Kembalikan kode OTP
        return OTP;
    }
    
    // Masukkan OTP ke Database
    private boolean otpInsert(Connection conn, String email, String OTP){
        String query = "UPDATE user SET otp = ? WHERE email = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, OTP);
            pstmt.setString(2, email);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Jika baris terpengaruh lebih dari 0, berarti pembaruan berhasil
        } catch (SQLException ex) {
            ex.printStackTrace(); // Log pesan kesalahan
            return false;
        }
    }
    
    // Metode kembali ke Login
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        // Membuat objek untuk frame login
        Login loginFrame = new Login();
        
        // Menampilkan frame login
        loginFrame.setVisible(true);
        
        // Menghilangkan frame signup
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailForgotTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField phonenumberForgotTextField;
    private javax.swing.JButton requestForgotButton;
    private javax.swing.JTextField usernameForgotTextField;
    // End of variables declaration//GEN-END:variables
}
