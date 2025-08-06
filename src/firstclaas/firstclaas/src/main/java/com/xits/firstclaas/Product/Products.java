package com.xits.firstclaas.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int prono;

    String proname,category;
    boolean isavailable;

    public int getProno() {
        return prono;
    }

    public Products() {
    }

    public Products(int prono, String proname, String category, boolean isavailable) {
        prono = prono;
        this.proname = proname;
        this.category = category;
        this.isavailable = isavailable;
    }

    public void setProno(int prono) {
        prono = prono;
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

    public boolean isIsavailabel() {
        return isavailable;
    }

    public void setIsavailabel(boolean isavailabel) {
        this.isavailable = isavailabel;
    }


}
