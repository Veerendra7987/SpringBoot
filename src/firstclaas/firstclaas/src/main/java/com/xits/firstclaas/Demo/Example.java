package com.xits.firstclaas.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Example {

    @GetMapping("/one")
    @ResponseBody
    public String fun1()
    {
        return "Sab Kuch";
    }

    @GetMapping("/two")
    public String fun2()
    {
        return "firstpage";
    }

    @GetMapping("/three")
    @ResponseBody
    public String fun3()
    {
        return "secondpage";
    }
    @GetMapping("/data")
    public String funn3(Model model)
    {
        int i=20, k=20, j=i+k;;

        model.addAttribute("val1",i);
        model.addAttribute("val2",k);
        model.addAttribute("val3",j);

        model.addAttribute("age",20);

        model.addAttribute("a",10);
        model.addAttribute("b",10);
        model.addAttribute("z","a+b");
        return"thirdpage";
    }

}
