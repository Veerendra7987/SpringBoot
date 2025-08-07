package com.example.Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/loop")
    public String loop(Model m4)
    {
        boolean ans=false;
        m4.addAttribute("isPresent",null);
        m4.addAttribute("age",2);
        m4.addAttribute("demo","active");
        m4.addAttribute("demo","inactive");
        m4.addAttribute("demo","Kuch");
        return "index";
    }
}
