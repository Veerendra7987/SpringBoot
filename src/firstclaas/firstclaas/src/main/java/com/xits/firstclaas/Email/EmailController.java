package com.xits.firstclaas.Email;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {
    @Autowired
    EmailService emailservicemail;

           @GetMapping("/send")
           @ResponseBody
           public String email(){
               System.out.println("kuch");
               emailservicemail.sendsimpleEmail("ashuahirwar512@gmail.com","Hello","From SpringBoot");
                return "Mail Sent";
           }
           @GetMapping("/sendhtml")
           @ResponseBody
           public String htmlEmail(){
               String htmlContent = "<h1>Welcome!</h1><p>This is Mail<b>HTML</b>email.</p>";
               emailservicemail.sendHtmlEmail("ashuahirwar512@gmail.com","Html eamil Subject",htmlContent);
               return "Email sent";
           }
           @GetMapping("/sendhtml1")
           @ResponseBody
           public String sendhtmlAttachment() throws MessagingException {
               emailservicemail.sendHtmlEmailWithAttachement(
                       "ashuahirwar512@gmail.com",
                       "testing email",
                       "this is the body of the testing email",
                       "/C:/Users/ashua/OneDrive/Desktop/java.jpg/"

               );
               return "Email Sent";
           }
               @GetMapping("/sendhtml2")
               @ResponseBody
               public String sendHtmlEmailWithAttachement1(){
                   String htmlContent = "<h1>Welcome!</h1><p>This is Mail<b>HTML</b>email.</p>";
                   emailservicemail.sendHtmlEmailWithInlineimage("ashuahirwar512@gmail.com","Html eamil Subject",htmlContent);
                   return "Email sent";
               }

}



