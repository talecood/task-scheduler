package com.taskscheduler;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendEmail {

	//Not Working For Now.
    public boolean sendEmail(String to, String from, String subject, String text) {
        boolean flag = false;

        
        // Email server settings
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS if using it
        properties.put("mail.smtp.host", "webmail.tubitak.gov.tr"); // Your internal email server's IP address or DNS name
        properties.put("mail.smtp.port", "25"); // Your internal email server's port number

        // Server login information
        String username = "your-username"; // Your username on the internal email server
        String password = "your-password"; // Your password on the internal email server

        // Email session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set the sender
            message.setFrom(new InternetAddress(from));

            // Set the recipients
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set the subject
            message.setSubject(subject);

            // Set the message content
            message.setText(text);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully.");
            flag = true;
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return flag;
    }
}