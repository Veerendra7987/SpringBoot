package com.xits.firstclaas.Doctor;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int docid;
    String name,
            specialisation, gender;
    LocalDate doj;
    Boolean residentdoctor;

    public Doctor(int docid, String name, String specialisation, LocalDate doj, Boolean residentdoctor, String gender) {
        this.docid = docid;
        this.name = name;
        this.specialisation = specialisation;
        this.doj = doj;
        this.residentdoctor = residentdoctor;
        this.gender = gender;
    }

    public Doctor() {
    }

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public Boolean getResidentdoctor() {
        return residentdoctor;
    }

    public void setResidentdoctor(Boolean residentdoctor) {
        this.residentdoctor = residentdoctor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}



