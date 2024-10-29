package org.example.banking;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double minimumBalance, String accountHolderName, double interestRate) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Current Account {" +
                "balance=" + getBalance() + // Include balance from parent class
                ", minimum Balance=" + getMinimumBalance() + // Include minimum balance from parent class
                ", account Holder Name='" + getAccountHolderName() + '\'' + // Include account holder name from parent class
                ", interest rate=" + interestRate +
                '}';
    }
}
