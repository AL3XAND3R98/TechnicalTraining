package com.sqlex.sqlex.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
    @Id
    int regno;
    int marks;
    String name;

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
