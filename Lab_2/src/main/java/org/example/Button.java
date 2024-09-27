package org.example;

// Задание 1
class Button {
    int pressedCount;

    public Button() {
        pressedCount = 0;
    }

    public void click() {
        pressedCount += 1;

        System.out.println("I've been pressed " + pressedCount + " times");
    }
}
