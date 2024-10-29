package org.example.banking;


import org.example.banking.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount();
    }

    @Test
    void testGetBalance() {
        bankAccount.setBalance(1000);
        Assertions.assertEquals(bankAccount.getBalance(), 1000.0);
    }


    @Test
    void testGetMinimumBalance() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMinimumBalance(0);
        Assertions.assertEquals(bankAccount.getMinimumBalance(), 0);
    }

    @Test
    void deposit() {
        bankAccount.deposit(1000);
        Assertions.assertEquals(bankAccount.getBalance(), 1000);
    }

    @Test
    void withdraw() {
        bankAccount.withdraw(1000);
        Assertions.assertEquals(bankAccount.getBalance(), 0);
    }

}
