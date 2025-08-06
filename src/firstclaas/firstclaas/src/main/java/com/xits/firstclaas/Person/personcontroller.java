package com.xits.firstclaas.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class personcontroller {
    @Autowired
    personRepository personrepository;

    @GetMapping("/signup")
    public String signup()
    {
        return "personForm";
    }

    @PostMapping("/saveperson")
    public String saveperson(int id,String name,String gender)
    {
        person p= new person();
        p.setId(id);
        p.setName(name);
        p.setGender(gender);
        personrepository.save(p);
        return "datasave";
    }
}
