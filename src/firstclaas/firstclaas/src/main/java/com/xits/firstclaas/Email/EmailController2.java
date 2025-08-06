package com.xits.firstclaas.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController2 {
    @Autowired
    public EmailService2 emailservice;

    @GetMapping("/senderemail")
    public String home(){
        return "Home_form";
    }
    @PostMapping("/saveemail")
    public String sendEmail(@RequestParam("to")String to,
                            @RequestParam("subject")String subject,
                            @RequestParam("body")String body,
                            Model model){
        emailservice.simpleEmail(to,subject,body);
        return "Home_form";

    }
}

