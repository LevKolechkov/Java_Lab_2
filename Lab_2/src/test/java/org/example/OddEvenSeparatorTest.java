package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenSeparatorTest {
    OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();

    @Test
    void oddOrEven(){
        oddEvenSeparator.addNumber(2);
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(12);

        ArrayList<Integer> expectedEvenList = new ArrayList<Integer>();
        expectedEvenList.add(2);
        expectedEvenList.add(12);
        assertEquals(expectedEvenList, oddEvenSeparator.evenList);

        ArrayList<Integer> expectedOddList = new ArrayList<Integer>();
        expectedOddList.add(5);
        assertEquals(expectedOddList, oddEvenSeparator.oddList);
    }
}
