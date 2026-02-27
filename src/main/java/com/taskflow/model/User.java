package com.taskflow.model;

public class User {

    private int id;
    private String name;
    private String email;
    private String role; // "ADMIN" or "USER"

    public User(int id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("────────────────────────");
        System.out.println("ID:    " + id);
        System.out.println("Name:  " + name);
        System.out.println("Email: " + email);
        System.out.println("Role:  " + role);
        System.out.println("────────────────────────");
    }

    // Getters
    public int getId()      { return id; }
    public String getName() { return name; }
    public String getEmail(){ return email; }
    public String getRole() { return role; }
}