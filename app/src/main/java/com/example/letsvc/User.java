package com.example.letsvc;

public class User {



    private String name, email, pass;




    public User(){


    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass= pass;
    }
}
