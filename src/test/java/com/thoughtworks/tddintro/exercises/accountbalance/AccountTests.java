package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        account.deposit(200);
        assertEquals(account.getBalance(),200);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account();
        account.deposit(300);
        account.withdraw(200);
        assertEquals(account.getBalance(),100);
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account();
        account.deposit(300);
        account.withdraw(500);
        assertEquals(account.getBalance(),300);

    }
}
