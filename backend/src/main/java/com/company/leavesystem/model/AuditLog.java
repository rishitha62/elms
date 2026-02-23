package com.company.leavesystem.model;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import javax.persistence.GeneratedValue;

@entity
public class AuditLog {
    Id
    @value((strategy=GenerationType.IDENTITY))
    private Long id;
    private String username;
    private String action;
    private LocalDate timestamp;

    public AuditLog() { }

    public AuditLog(String username, String action, LocalDate timestamp) {
        this.username = username;
        this.action = action;
        this.timestamp = timestamp;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
    public LocalDate getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDate timestamp) { this.timestamp = timestamp; }
}
