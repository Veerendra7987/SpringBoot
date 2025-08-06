package com.xits.firstclaas.Relatives;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class relativesController3 {
    @Autowired
    relativsRepository2 r2;

    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model){
        Relatives r=r2.findById(id).orElse(null);
        if(r!=null){
            model.addAttribute("hero",r);
                    return "showcurrentdata";
        }
        return "notfound";

    }
    @PostMapping("/savedata")
        public String savedata(@ModelAttribute Relatives r){
            r2.save(r);
            return"confirmation";
        }
    }

