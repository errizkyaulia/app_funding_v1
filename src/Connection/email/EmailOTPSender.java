/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection.email;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Rizky
 */
public class EmailOTPSender {
    public boolean sendEmail(String emailOTP, String OTP){
        try {
            // Load properties from application.properties file
            Properties props = new Properties();
            props.load(EmailSignupSender.class.getClassLoader().getResourceAsStream("Config/application.properties"));

            final String username = props.getProperty("email.smtp.username");
            final String password = props.getProperty("email.smtp.password");

            Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

            String emailSubject = "One-Time Password (OTP)";
            String emailBody = "Kode OTP Anda: " + OTP;
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailOTP));
            message.setSubject(emailSubject);
            message.setText(emailBody);

            Transport.send(message);

            System.out.println("Email terkirim!");
            JOptionPane.showMessageDialog(null, "Email send to: " + emailOTP);
            return true;
        } catch (MessagingException | IOException e) {
            JOptionPane.showMessageDialog(null, "Cannot send email");
            throw new RuntimeException(e);
        }
    }
}
