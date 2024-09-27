package org.example;

// Задание 2
class Balance {
    int leftWeight;
    int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public Balance(int leftWeight, int rightWeight) {
        this.leftWeight = leftWeight;
        this.rightWeight = rightWeight;
    }

    public void addRight(int addWeight) {
        this.rightWeight += addWeight;
    }

    public void addLeft(int addWeight) {
        this.leftWeight += addWeight;
    }

    public void result() {
        if (leftWeight == rightWeight) System.out.println("=");
        else if (leftWeight < rightWeight) System.out.println(("R"));
        if (rightWeight > leftWeight) System.out.println("L");
    }
}
