package com.xits.firstclaas.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class vardemo {
    @GetMapping("/vardemo1")
    public String vardemo1(Model model) {
        model.addAttribute("name", "RajaBabu");
        model.addAttribute("contract", "56324515");
        return "vardemo";
    }

    @GetMapping("/demo2")
    public String demo2(Model model) {
        List<String> list = List.of("c", "c++", "java", "python");
        model.addAttribute("lang", list);
        return "langauge";
    }
    @GetMapping("getfrag1")
    public String getPage(Model model)
    {
        model.addAttribute("name","Verendra");
        model.addAttribute("add","Makroniya");
        return "home";
    }
    @GetMapping("child")
    public String getpage()
    {
        return "child";
    }

}

