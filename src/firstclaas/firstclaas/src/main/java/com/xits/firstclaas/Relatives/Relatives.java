package com.xits.firstclaas.Relatives;

import jakarta.persistence.*;

@Entity
@Table(name="relativs")
public class Relatives {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public int getId() {
        return id;
    }

    public Relatives() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public Relatives(int id, String name, String relation, String nature) {
        this.id = id;
        this.name = name;
        this.relation = relation;
        this.nature = nature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    String name,relation,nature;
}
