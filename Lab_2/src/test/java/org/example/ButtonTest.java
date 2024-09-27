package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonTest {
    Button button = new Button();

    @Test
    void click(){
        for (int clickTimes = 0; clickTimes < 50; ++clickTimes) button.click();
        assertEquals(50, button.pressedCount);
    }
}
