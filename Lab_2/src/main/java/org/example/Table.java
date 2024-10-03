package org.example;

// Задание 5
class Table {
    int[][] numbers;

    public Table(int rows, int columns) {
        numbers = new int[rows][columns];
    }

    public int getValue(int row, int col) {
        System.out.println(numbers[row][col]);
        return numbers[row][col];
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
        StringBuilder stringOfNumbers = new StringBuilder();

        for (int[] row : numbers) {
            for (int secondIndex = 0; secondIndex < numbers[0].length; ++secondIndex) {
                int number = row[secondIndex];
                stringOfNumbers.append(number);
            }
        }

        return stringOfNumbers.toString();
    }

    public Double average() {
        double average;
        int sum = 0;
        int count = 0;

        for (int[] number : numbers) {
            for (int secondIndex = 0; secondIndex < numbers[0].length; ++secondIndex) {
                ++count;
                sum += number[secondIndex];
            }
        }

        average = (double) sum / count;
        return average;
    }
}
