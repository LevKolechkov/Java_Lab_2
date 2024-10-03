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

    public String result() {
        if (leftWeight == rightWeight) {
            System.out.println("=");
            return "=";
        }
        if (leftWeight < rightWeight) {
            System.out.println(("R"));
            return "R";
        }
        System.out.println("L");
        return "L";
    }
}
