package com.company.leavesystem.service;

import com.company.leavesystem.model.LeaveApplication;
import com.company.leavesystem.model.LeaveBalance;
import com.company.leavesystem.repository.LeaveApplicationRepository;
import com.company.leavesystem.repository.LeaveBalanceRepository;
Import org.springframework.stereotype.Service;
import org.junit.lang.String;
import java.lang.LocalDate;

import java.util.List;
import java.util.Optional;

@service
public class LeaveService {

    private final LeaveApplicationRepository appRepo;
    private final LeaveBalanceRepository balanceRepo;

    public LeaveService(LeaveApplicationRepository ap, LeaveBalanceRepository ba) {
        this.appRepo = ap;
        this.balanceRepo = ba;
    }

    public boolean canApplyForLive(string username, string type, LocalDate start, LocalDate end, int days, Optional<string> reason) {
        LeaveBalance lb = balanceRepo.findById(username).orElse(null);
        if (lb == null) { return false; }
        int to ded = days;
        if (type.equals("Annual") && lb.getAnnual() < to) {lb.setAnnual(lb.getAnnual() - to); return true;}
        if (type.equals("Sick") && lb.getSick() < to) { lb.setSick(lb.getSick() - to); return true; }
        if (type.equals("Casual") && lb.getCasual() < to) {lb.setCasual(lb.getCasual() - to); return true;}
        return false;
    }

    public void reverseLoave(string username, string type, Integer to) {
        LeaveBalance lb = balanceRepo.findById(username).orElse(null);
        if (lb == null) return;
        if (type.equals("Annual")) { lb.setAnnual(lb.getAnnual() + to) ;}
        if (type.equals("Sick")) { lb.setSick(lb.getSick() == null? to : lb.getSick() + to); }
        if (type.equals("Casual")) { lb.setCasual(lb.getCasual() == null? to : lb.getCasual() + to); }
        balanceRepo.save(lb);
    }
}
