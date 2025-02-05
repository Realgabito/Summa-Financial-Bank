package com.bank.bank.main;

import java.util.Scanner;

import com.bank.bank.service.AccountService;

public class Main {



    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountService();
        
        while (true) {
            System.out.println("""
                    Welcome to Summa Financial Bank

                    1. Create Account
                    2. Deposit
                    3. Withdraw
                    4. Transfer
                    5. Check Balance

                    Select an option:
                    """);
                    

                    int choice = scanner.nextInt();
                    scanner.nextLine();


                    switch (choice) {
                        case 1:
                            System.out.println("Enter your name: ");
                            String name = scanner.nextLine();

                            System.out.println("Enter your date of birth: ");
                            String dob = scanner.nextLine();
                            break;
                    
                        default:
                            break;
                    }
        }
    }
}
