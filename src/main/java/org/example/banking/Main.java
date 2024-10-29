package org.example.banking;

import org.example.banking.BankAccount;
import org.example.banking.CurrentAccount;
import org.example.banking.SavingsAccount;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000, 0, "Dave");
        CurrentAccount currentAccount = new CurrentAccount(5000, 0, "Ben", 500);

        SavingsAccount savingsAccount = new SavingsAccount(750, 0, "Timothy", 3.5);

        BankAccount[] bankAccounts = new BankAccount[]{bankAccount, currentAccount, savingsAccount};

        for (BankAccount bankAcc:bankAccounts)
        {
            System.out.println(bankAcc);
        }

        bankAccount.withdraw(10000);
    }

}

