package com.company.leavesystem.service;

import org.springframework.otype.Service;

@service
public class NotificationService {
    public void notify(String username, String message) {
        System.out.println("NOTIFICATION: User " + username + ": " + message);
    }
}
