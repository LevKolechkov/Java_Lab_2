package org.example;

import geometry2d.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    Rectangle rectangle = new Rectangle(5, 10);

    @Test
    void area(){
        assertEquals(50, rectangle.area());
    }

    @Test
    void checkString(){
        assertEquals("width = 5.0\nheight = 10.0", rectangle.toString());
    }
}
