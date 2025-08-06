package com.xits.firstclaas.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sample {

    @GetMapping("/page1")
    @ResponseBody
    public String thanks()
    {
        return "Kuch Nhi Kar rahe";
    }

    @GetMapping("/page2")
    @ResponseBody
    public String welcome()
    {
        return "Kuch to Karna padega";
    }
}
