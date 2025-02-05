package com.bank.bank.model;

import java.time.LocalDateTime;
import java.util.Random;

public class Account {

    private Long id;
    private String name;
    private String password;    // must be at least 8 characters
    private double balance;
    private String accountNumber;  // must be 16 digits and unique
    private String currency;    
    private String phoneNumber;    // must be 10 digits and unique
    private LocalDateTime createdAt; 
    private boolean isActive;



    public Account() {
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber() {
        // generate a random 16 digit number
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
    return sb.toString();
    }
}
