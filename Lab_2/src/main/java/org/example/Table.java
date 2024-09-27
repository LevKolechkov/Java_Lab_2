package org.example;

// Задание 5
class Table {
    int[][] numbers;

    public Table(int rows, int columns) {
        numbers = new int[rows][columns];
    }

    public void getValue(int row, int col) {
        System.out.println(numbers[row][col]);
    }

    public void setValue(int row, int col, int value) {
        numbers[row][col] = value;
    }

    public int rows() {
        int rowsCount = numbers.length;
        System.out.println(rowsCount);
        return rowsCount;
    }

    public int cols() {
        int colsCount = numbers[0].length;
        System.out.println(colsCount);
        return colsCount;

    }

    public String toString() {
        String stringOfNumbers = "";

        for (int firstIndex = 0; firstIndex < numbers.length; ++firstIndex) {
            for (int secondIndex = 0; secondIndex < numbers[0].length; ++secondIndex) {
                int number = numbers[firstIndex][secondIndex];
                stringOfNumbers += String.valueOf(number);
            }
        }

        return stringOfNumbers;
    }

    public Double average() {
        double average = 0;
        int sum = 0;
        int count = 0;

        for (int firstIndex = 0; firstIndex < numbers[0].length; ++firstIndex) {
            for (int secondIndex = 0; secondIndex < numbers.length; ++secondIndex) {
                ++count;
                sum += numbers[firstIndex][secondIndex];
            }
        }

        average = (double) sum / count;
        return average;
    }
}
