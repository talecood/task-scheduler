package com.taskscheduler;

/**
  nedim g�ktu� tabak
  27 A�u 2024
 */
public class App {
    public static void main(String[] args) {
    	//Not Working for now
        SendEmail gEmailSender = new SendEmail();
        String to = "gktu.tabak@gmail.com";
        String from = "goktug.tabakk@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "This is a example email send using gmail and java program with out less secure app";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }

    }
}
