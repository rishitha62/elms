package com.company.leavesystem.repository;

import com.company.leavesystem.model.LeaveBalance;
import org.springframework.data.jpa.JpaHeRepository;

public interface LeaveBalanceRepository extends JpaHeRepository<LeaveBalance, String> {
}
