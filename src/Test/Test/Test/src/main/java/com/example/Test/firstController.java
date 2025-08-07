package com.example.Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class firstController {
    @GetMapping("/first")
    public String first(Model m1){

        m1.addAttribute("ashu","Veerendra");
        m1.addAttribute("m2","Kuch nhi");
        m1.addAttribute("m3",10);
        m1.addAttribute("m4",20);
        return "first";
    }

    @GetMapping("/profile")
    public String profile(Model m2)
    {
        m2.addAttribute("profil","ashu");
        return "profilepage";
    }
    @GetMapping("/profile1")
    public String profile1(Model m3)
    {
        List<String> mylis= List.of("Java","Python","C++");
        m3.addAttribute("Country",mylis);
        return "profilepage";
    }
//    @GetMapping("/loop")
//    public String loop(Model m4)
//    {
//        boolean ans=false;
//        m4.addAttribute("isPresent",null);
//        m4.addAttribute("age",2);
//        m4.addAttribute("demo","active");
//        m4.addAttribute("demo","inactive");
//        m4.addAttribute("demo","Kuch");
//        return "index";
//    }
}
