package com.epam.mikhail_kobzev.java.lesson7.entities;

/**
 * Created by Mike on 01.06.2018.
 */
public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public Employee() {

    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
}
