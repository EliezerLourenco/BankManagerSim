package com.example.bank;

import java.util.Scanner;

/**
 * Runner class to interact with the Bank and Account classes.
 */
public class Runner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Bank Name:");
            String bankName = scanner.nextLine();
            System.out.println("Enter Branch Location:");
            String branchLocation = scanner.nextLine();

            Bank bank = new Bank(bankName, branchLocation);
            System.out.printf("Welcome to %s branch of %s Bank%n", branchLocation, bankName);

            // Rest of the implementation...
        } catch (Exception e) {
            e.printStackTrace(); // For debugging, better error handling should be implemented
        }
    }
}
