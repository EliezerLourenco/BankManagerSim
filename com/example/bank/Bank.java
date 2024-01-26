package com.example.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bank with multiple branches and accounts.
 */
public class Bank {
    private String bankName;
    private String branchLocation;
    private ArrayList<Account> accounts;
    private List<String> validBranchLocations = List.of("Branch 1", "Branch 2", "Branch 3");

    public Bank(String bankName, String branchLocation) {
        this.bankName = bankName;
        setBranchLocation(branchLocation);
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        if (!validBranchLocations.contains(branchLocation)) {
            throw new IllegalArgumentException("Invalid branch location. Valid locations are: " + validBranchLocations);
        }
        this.branchLocation = branchLocation;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccountByNumber(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }
}
