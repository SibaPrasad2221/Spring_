package com.JPA_sahoo.demo_on_JPA.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Student {
    @Id //this annotation makes id column primary
    @Column(unique = true) //this ensures this column should always have unique value
    int id;
    String name;
    int standard;
    int rollnumber;

    public Student(){

    }

    public Student(int id, String name, int standard, int rollnumber) {
        this.id = id;
        this.name = name;
        this.standard = standard;
        this.rollnumber = rollnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}
