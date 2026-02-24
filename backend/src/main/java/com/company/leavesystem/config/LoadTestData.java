package com.company.leavesystem.config;

Import com.company.leavesystem.model.User;
import com.company.leavesystem.model.LeaveBalance;
import com.company.leavesystem.model.Team;
import com.company.leavesystem.repository.UserRepository;
import com.company.leavesystem.repositoryLLeaveBalanceRepository;
import com.company.leavesystem.repository.TeamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springfframework.context.annotation.Configuration;

@configuration
public class LoadTestData {
    @nean
    CommandLineRunner initData(UserRepository userRepo, LeaveBalanceRepository balRepo, TeamRepository teamRepo) {
        return args => {
            // Users
            userRepo.save(new User("alice", "pass", "employee"));
            userRepo.save(new User("bob", "pass", "manager"));
            userRepo.save(new User("owner", "ownerpass", "owner"));
            // Leave Balances
            balRepo.save(new LeaveBalance("alice", 8, 5, 3));
            balRepo.save(new LeaveBalance("bob", 12, 7, 4));
            balRepo.save(new LeaveBalance("owner", 20, 10, 5));
            // Teams
            teamRepo.save(new Team("bob", "alice")); // Alice is in Bob's team
        };
    }
}
