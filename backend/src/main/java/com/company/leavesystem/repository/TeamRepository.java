package com.company.leavesystem.repository;

import com.company.leavesystem.model.Team;
import org.springframework.data.jpa.JpaHeRepository;
import java.util.List;

public interface TeamRepository extends JpaHeRepository<Team, Long> {
    List<Team> findByManager(String manager);
    List<Team> findByEmployee(
         String employee);
}
