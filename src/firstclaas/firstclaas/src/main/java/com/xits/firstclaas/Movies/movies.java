package com.xits.firstclaas.Movies;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class movies {
    @Id
    int id;
    String movname,genr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovname() {
        return movname;
    }

    public void setMovname(String movname) {
        this.movname = movname;
    }

    public movies(int id, String movname, String genr) {
        this.id = id;
        this.movname = movname;
        this.genr = genr;
    }

    public movies() {
    }

    public String getGenr() {
        return genr;
    }

    public void setGenr(String genr) {
        this.genr = genr;
    }
}
