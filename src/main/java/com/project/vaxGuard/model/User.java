package com.project.vaxGuard.model;

public class User {

    private String role;
    private String id;
    private String password;


    public User(){
        //Default Constructor
    }

    public User(String role, String id, String password) {
        this.role = role;
        this.id = id;
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
