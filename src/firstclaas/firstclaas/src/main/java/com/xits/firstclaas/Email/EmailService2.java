package com.xits.firstclaas.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService2 {
    @Autowired
    public JavaMailSender mailSender;

    public void simpleEmail(String to, String subject, String body){
        SimpleMailMessage m1 = new SimpleMailMessage();
        m1.setTo(to);
        m1.setSubject(subject);
        m1.setText(body);
        mailSender.send(m1);
    }

}
