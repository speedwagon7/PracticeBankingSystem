package org.example.banking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {

    private CurrentAccount currentAccount;

    @BeforeEach
    public void setUp(){
        currentAccount = new CurrentAccount(1000.0, 0, "Bob", 500);
    }
    @AfterEach
    void tearDown() {
        currentAccount = null;
    }
    @Test
    void testGetBalance() {
        currentAccount.setBalance(1000.0);
        Assertions.assertEquals(currentAccount.getBalance(), 1000.0);
    }

    @Test
    void testGetMinimumBalance() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMinimumBalance(0);
        Assertions.assertEquals(bankAccount.getMinimumBalance(), 0);
    }

    @Test
    void deposit() {
        currentAccount.deposit(1000.0);
        Assertions.assertEquals(currentAccount.getBalance(), 2000.0);
    }

    @Test
    void testWithdraw() {
        currentAccount.setBalance(1000.0);
        currentAccount.withdraw(100.0);
        Assertions.assertEquals(currentAccount.getBalance(), 900);
    }

    @Test
    void testWithdrawOverMaximumWithdrawal() {
        currentAccount.setBalance(1000.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            currentAccount.withdraw(100000.0); // Trying to withdraw more than the max limit
        });

        // Verify the exception message
        assertEquals("Cannot withdraw over maximum", exception.getMessage());

    }
}