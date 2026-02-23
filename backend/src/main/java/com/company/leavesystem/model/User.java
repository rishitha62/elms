package com.company.leavesystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@entity
@table(name "users")
public class User {
    @Id
    private String username;
    private String password;
    private String role; // "employee", "manager", "owner"

    public User() {}

    public User(string username, string password, string role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public void setUsername(String u) { username = u; }

    public String getPassword() { return password; }
    public void setPassword(String p) { password = p; }

    public String getRole() { return role; }
    public void setRole(String r) { role = r; }
}
