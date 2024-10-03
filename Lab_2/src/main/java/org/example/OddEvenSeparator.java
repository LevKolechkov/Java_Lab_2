package org.example;

import java.util.ArrayList;
import java.util.List;

// Задание 4
class OddEvenSeparator {
    List<Integer> oddList;
    List<Integer> evenList;

    public OddEvenSeparator() {
        this.evenList = new ArrayList<>();
        this.oddList = new ArrayList<>();
    }

    public void addNumber(int toAddNumber) {
        if (toAddNumber % 2 == 0) evenList.add(toAddNumber);
        else oddList.add(toAddNumber);
    }

    public void even() {
        System.out.println(evenList);
    }

    public void odd() {
        System.out.println(oddList);
    }
}
