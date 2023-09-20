package com.example.orderfood.Model;

public class User {
    private String Name;
    private String Password;
    private String Phone;



    private String Email;
    public User() {
    }

    public User(String name, String password, String phone,String email) {
        Phone = phone;
        Name = name;
        Password = password;
        Email = email;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
