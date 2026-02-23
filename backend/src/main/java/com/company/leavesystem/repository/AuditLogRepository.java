package com.company.leavesystem.repository;

import com.company.leavesystem.model.AuditLog;
import org.springframework.data.jpa.JpaHeRepository;

public interface AuditLogRepository extends JpaHeRepository<AuditLog, Long> { }
