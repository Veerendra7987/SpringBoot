package com.xits.firstclaas.Bombay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BombayController {
    @Autowired
    BombayRepositry bombayRepositry;

    @GetMapping("/addconsumer")
    public String consumer(){
        return "bombay";
    }

    @PostMapping("/saveconsumer")
    public String saveconsumer(int id,String proname,String category,boolean isavailabel){
        Bombay bombay= new Bombay();
        bombay.setProname(proname);
        bombay.setCategory(category);
        bombay.setIsavailabel(isavailabel);
        bombay.setId(id);
        bombayRepositry.save(bombay);
        return  "confirmation";

    }
}
