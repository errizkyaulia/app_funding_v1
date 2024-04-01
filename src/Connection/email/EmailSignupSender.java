/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection.email;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.io.IOException;
/**
 *
 * @author Rizky
 */
public class EmailSignupSender {
    public static void sendEmail(String recipientEmail, String token) {
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

            String web_url = props.getProperty("WEB_HOST");
            String emailSubject = "Verifikasi Akun";
            String emailBody = "Klik link berikut untuk verifikasi akun Anda: " + web_url + "verify.php?token=" + token;
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(emailSubject);
            message.setText(emailBody);

            Transport.send(message);

            System.out.println("Email terkirim!");
        } catch (MessagingException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
