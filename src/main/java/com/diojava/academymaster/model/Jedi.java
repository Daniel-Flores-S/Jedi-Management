package com.diojava.academymaster.model;


import org.springframework.lang.NonNull;

public class Jedi {
    @NonNull
    private String name;
    @NonNull
    private String lastName;

    public Jedi (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
