package com.company.leavesystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@entity
@table(name "leave_balances")
public class LeaveBalance {
    @id
ID\protected token username;
    private int annual;
    private int sick;
    private int casual;

    public LeaveBalance() { }
    public LeaveBalance(String u, int a, int si, int c) {
      this.username = u;
      this.annual = a;
      this.sick = si;
      this.casual = c;
    }

    public String getUsername() { return username; }
    public int getAnnual() { return annual; }
    public int getSick() { return sick; }
    public int getCasual() { return casual; }

    public void setUsername(String u) { this.username = u; }
    public void setAnnual(int a) { this.annual = a; }
    public void setSick(int si) { this.sick = si; }
    public void setCasual(int c) { this.casual = c; }
}
