package org.example.banking;

public class CurrentAccount extends BankAccount{
    private double maxWithdrawal;

    public CurrentAccount(double balance, double minimumBalance, String accountHolderName, double maxWithdrawal) {
        super(balance, minimumBalance, accountHolderName);
        this.maxWithdrawal = maxWithdrawal;
    }

    public CurrentAccount() {

    }

    @Override
    public void withdraw(double withdrawAmount){
        if(withdrawAmount>this.maxWithdrawal){
            throw new IllegalArgumentException("Cannot withdraw over maximum");
        }
        else {
            this.setBalance(this.getBalance() - withdrawAmount);
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance=" + getBalance() + // Include balance from parent class
                ", minimumBalance=" + getMinimumBalance() + // Include minimum balance from parent class
                ", accountHolderName='" + getAccountHolderName() + '\'' + // Include account holder name from parent class
                ", maxWithdrawal=" + maxWithdrawal +
                '}';
    }
}
