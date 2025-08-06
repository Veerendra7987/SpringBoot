package com.xits.firstclaas.Bombay;

import jakarta.persistence.*;

@Entity
@Table(name="prono")
public class Bombay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String proname,category;
    boolean isavailabel;

    public Bombay() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Bombay(int id, String proname, String category, boolean isavailabel) {
        this.id = id;
        this.proname = proname;
        this.category = category;
        this.isavailabel = isavailabel;
    }

    public boolean isIsavailabel() {
        return isavailabel;
    }

    public void setIsavailabel(boolean isavailabel) {
        this.isavailabel = isavailabel;
    }

}
