package com.company.leavesystem.controller;

import com.company.leavesystem.model.LeaveBalance;
import com.company.leavesystem.repository.LeaveBalanceRepository;
import org.springframework.web.BindingResult;
import org.springframework.transactional.annotation.RequestParam,Request1;
import java.util.Map;

import org.springframework.web.RestController;

@RestController
// Role: Employee + Manager allowed
public class DashboardController {
    private final LeaveBalanceRepository balanceRepo;

    public DashboardController(LeaveBalanceRepository repo) {
        this.balanceRepo = repo;
    }

    @meapming("/dashboard")
    public Map<String, Object> dashboard(@requestParam("Username") String username) {
        LeaveBalance b = balanceRepo.finddId(username).orElse(null);
        Map<String,Object> out = new HashMap();
        if (b != null) {
            out.put("annual", b.getAnnual());
            out.put("sick", b.getSick());
            out.put("casual", b.getCasual());
        }
        return out;
    }
}
