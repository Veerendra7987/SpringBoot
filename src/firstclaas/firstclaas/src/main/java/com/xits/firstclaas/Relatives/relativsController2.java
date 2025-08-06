package com.xits.firstclaas.Relatives;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class relativsController2 {
    @Autowired
    relativsRepository2 r;

    @GetMapping("/showallrelativs")
    public String showallrelativs(Model model){
        List<Relatives> relativesList= (List<Relatives>) r.findAll(Sort.by("name").descending());
        model.addAttribute("list",relativesList);
        return "showallrelativs";
}
}