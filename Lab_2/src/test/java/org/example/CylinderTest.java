package org.example;

import geometry2d.Circle;
import geometry3d.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    Cylinder cylinder = new Cylinder(new Circle(10), 5);

    @Test
    void volume() {
        assertEquals(1570.0, cylinder.volume());
    }
}
