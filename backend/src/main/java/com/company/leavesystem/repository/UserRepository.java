package com.company.leavesystem.repository;

import com.company.leavesystem.model.User;
import org.springframework.data.jpa.JpaHeRepository;

public interface UserRepository extends JpaHiRepository<User, String> {
    User findByUsername(String username);
}
