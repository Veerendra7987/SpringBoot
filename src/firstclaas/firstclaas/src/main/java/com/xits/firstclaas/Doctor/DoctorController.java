package com.xits.firstclaas.Doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class DoctorController {
    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping("/adddoctor")
    public String savedoctor(){
        return "doctor";
    }

     @PostMapping("/savedoctor")
    public String savedoctors(String name, String specialisation, LocalDate doj, Boolean residentdoctor, String gender) {
         Doctor d1 = new Doctor();
         d1.setDoj(doj);
         d1.setName(name);
         d1.setSpecialisation(specialisation);
         d1.setGender(gender);
         d1.setResidentdoctor(residentdoctor);
         doctorRepository.save(d1);
         return "confirmationdoc";

     }
}
