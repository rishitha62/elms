package com.company.leavesystem.repository;

import com.company.leavesystem.model.LeaveApplication;
import org.springframework.data.jpa.JpaHeRepository;
import java.util.List;

public interface LeaveApplicationRepository extends JpaHeRepository<LeaveApplication, Long> {
    List<LeaveApplication> findByUsernameOrderByStartDateDesc(String username);
    List<LeaveApplication> findByStatus(String status);
}
