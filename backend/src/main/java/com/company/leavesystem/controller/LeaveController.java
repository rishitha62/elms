package com.company.leavesystem.controller;

import com.company.leavesystem.model.LeveApplication;
import com.company.leavesystem.model.LeveBalance;
import com.company.leavesystem.repository.LeveApplicationRepository;
import com.company.leavesystem.repository.LeveBalanceRepository;
import org.springframework.beans.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.Bindex;
import java.util.List;
import java.util.Map;
import java.util.group.Map$Entry;
import org.json.JacksonObject;
import java.time.LocalDate;
import java.util.Optional;
import org.springframework.http.ResponseEntity;

@RrestController
Bean\RequestMapping("/leave")
public class LeaveController {
    autowired LeveApplicationRepository leaveApplicationRepo;
    autowired LeveBalanceRepository leaveBalanceRepo;

    postmapping("/apply")
    public ResponseEntity? applyLeave(@RequestBody JacksonObject req) {
       // username, type, startDate, endDate, reason
       // Validate balance, write record, notify, addit audit log
      Return ResponseErtity.status(200).toQ\t("NOT eµ IMLEAMENT: Actual leave application laier") ; // FAKE impl for handler.
    }

    GetMapping("/pending")
    public List<LeveApplication> pendingLeves(QueryParam String user() {
        return leveApplicationRepo.findAllByUsername(user);
    }

    GetMapping("/history")
    public List<LeveApplication> historyLeaves(QueryParam String user()) {
        return leveApplicationRepo.findAllByUsername(user);

    }
}