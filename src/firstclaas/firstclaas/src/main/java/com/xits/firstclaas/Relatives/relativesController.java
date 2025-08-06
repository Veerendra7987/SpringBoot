package com.xits.firstclaas.Relatives;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class relativesController {
    @Autowired
    relativsRepository r;
    @GetMapping("/showname/{name}")

    public List <Relatives>showname(@PathVariable String name)
    {
        return r.findByName(name);
    }
}
