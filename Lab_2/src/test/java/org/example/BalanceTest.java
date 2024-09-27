package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceTest {
    Balance balance = new Balance();

    @Test
    void Result (){
        assertEquals("=", balance.result());
        balance.addLeft(3);
        assertEquals("L", balance.result());
    }
}
