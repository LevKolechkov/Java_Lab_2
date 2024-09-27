package org.example;

import geometry2d.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    Circle circle = new Circle(10);

    @Test
    void area() {
        assertEquals(314.0, circle.area());
    }

    @Test
    void checkString(){
        assertEquals("radius = 10.0", circle.toString());
    }
}
