package tpractice.toop.task1test;

// Test related libraries
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// What we're gonna test
import practice.oop.task1.BankAccount;

class SolutionTask {

    @Test
    void newUserIsBroke(){
        assertEquals(new BankAccount("Perniciousness").getAccount(), 0);
    }

    @Test
    void bankAccountFunctions(){
        BankAccount user = new BankAccount("Perniciousness");
        user.storeMoney(500);
        assertEquals(user.getAccount(), 500);
        user.storeMoney(-42);
        assertEquals(user.getAccount(), 500);
        user.takeMoney(400);
        assertEquals(user.getAccount(), 100);
        user.takeMoney(34);
        assertEquals(user.getAccount(), 66);
        user.takeMoney(80);
        assertEquals(user.getAccount(), 66);
        user.takeMoney(-1000);
        assertEquals(user.getAccount(), 66);
    }
}
