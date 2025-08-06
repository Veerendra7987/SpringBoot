package com.xits.firstclaas.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo {

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome()
    {
        return "welcome";
    }
}


