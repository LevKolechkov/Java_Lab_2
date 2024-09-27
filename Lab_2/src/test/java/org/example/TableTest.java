package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TableTest {
    Table table = new Table(3, 2);

    @Test
    void getValue(){
        table.setValue(2,1,16);
        assertEquals(16, table.getValue(2,1));
    }

    @Test
    void rows(){
        assertEquals(3, table.rows());
    }

    @Test
    void cols(){
        assertEquals(2, table.cols());
    }

    @Test
    void checkString(){
        assertEquals("000000", table.toString());
    }

    @Test
    void average(){
        table.setValue(1,0,12);
        table.setValue(1,1,15);
        table.setValue(2,1,3);
        assertEquals(5, table.average());
    }
}
