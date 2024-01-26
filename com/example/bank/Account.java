package com.example.bank;

/**
 * Represents a bank account with basic details and validation.
 */
public class Account {
    private String accountNumber;
    private double accountBalance;
    private String accountName;

    public Account(String accountNumber, double accountBalance, String accountName) {
        setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
        setAccountName(accountName);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (!accountNumber.matches("^[a-zA-Z0-9]*$")) {
            throw new IllegalArgumentException("Account number can only contain alphanumeric characters.");
        }
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance < 0) {
            throw new IllegalArgumentException("Account balance cannot be negative.");
        }
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        if (!accountName.matches("^[a-zA-Z\\s-]*$")) {
            throw new IllegalArgumentException("Account name can only contain alphabetic characters, spaces, and hyphens.");
        }
        this.accountName = accountName;
    }
}
