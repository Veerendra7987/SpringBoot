package com.xits.firstclaas.Email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailService {
    @Autowired
    public JavaMailSender mailSender;


    public void sendsimpleEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ashuahirwar29@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }

    public void sendHtmlEmail(String to, String subject, String htmlBody) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("ashuahirwar29@gmail.com");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(htmlBody, true);
            mailSender.send(message);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public void sendHtmlEmailWithInlineimage(String to, String subject, String body) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("ashuahirwar29@gmail.com");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body, true);

            ClassPathResource image = new ClassPathResource("/static/Virat_Kohli_.jpg");
            helper.addInline("log", image);

            mailSender.send(message);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public void sendHtmlEmailWithAttachement (String to, String subject, String body, String attachmentpath){
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("ashuahirwar29@gmail.com");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body, true);
            FileSystemResource file = new FileSystemResource(new File(attachmentpath));
            helper.addAttachment(file.getFilename(), file);
            ClassPathResource image = new ClassPathResource("C://Users//ashua//Downloads//Virat_Kohli_.jpg/");
            helper.addInline("log", image);
            mailSender.send(message);
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

}




