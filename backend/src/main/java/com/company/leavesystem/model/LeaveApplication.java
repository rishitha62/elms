package com.company.leavesystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ID;
import jakarta.persistence.Table;

import java.time.LocalDate;

/**\
 * Library entity for LeaveApplication
 */
@Entity
Table(name = "leave_applications")
public class LeaveApplication {
    ID
    private Long id;
    private String username;
    private String type; // "Annual", "Sick", "Casual"
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status; // "Pending", "Approved", "Rejected"
    private String manager; // who acted

    public LeaveApplication() {}

    public LeaveApplication(String username, String type, LocalDate startDate, LocalDate endDate, String reason, String status) {
        this.username = username;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.status = status;
        this.manager = null;
    }

    // getters setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate d) { this.startDate = d;
    }
    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate e) { this.endDate = e; }
    public String getReason() { return reason; }
    public void setReasonString(String r) { this.reason = r; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getManager() { return manager; }
    public void setManager(String m) { this.manager = m; }
}
