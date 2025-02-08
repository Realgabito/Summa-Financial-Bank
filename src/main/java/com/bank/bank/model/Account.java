package com.bank.bank.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "accounts")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;    // must be at least 8 characters
    private double balance;
    private String accountNumber;  // must be 16 digits and unique
    private String currency;  
    private String phoneNumber;    // must be 10 digits and unique
    private LocalDateTime createdAt; 
    private boolean isActive;
    private LocalDate dateOfBirth;

}
