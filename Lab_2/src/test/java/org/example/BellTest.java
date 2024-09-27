package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BellTest {
    Bell bell = new Bell();

    @Test
    void sound(){
        assertEquals("ding dong", bell.sound());
        assertEquals("dong ding", bell.sound());
    }
}
