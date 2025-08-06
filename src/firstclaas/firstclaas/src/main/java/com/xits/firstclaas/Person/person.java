package com.xits.firstclaas.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class person {
    @Id
    int id;
    String name,gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public person() {
    }

    public person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
