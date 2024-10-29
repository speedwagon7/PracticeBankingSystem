package org.example.banking;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private String accountHolderName;

    public BankAccount() {
    }
    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){
        if(this.balance- withdrawAmount<this.minimumBalance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        else {
            this.setBalance(this.balance - withdrawAmount);
        }

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setMinimumBalance(double minBalance) {
        this.minimumBalance = minBalance;
    }

    public double getMinimumBalance() {
        return this.minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", minimumBalance=" + minimumBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
