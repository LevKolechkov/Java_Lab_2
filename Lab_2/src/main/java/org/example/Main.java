package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {

    public static void main(String[] args){
        Button button = new Button();
        for (int count = 0; count < 3; ++count){
            button.click();
        }

        Balance balance = new Balance();
        balance.addRight(16);
        balance.result();

        Bell bell = new Bell();
        for (int count = 0; count < 3; ++count){
            bell.sound();
        }

        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
        oddEvenSeparator.addNumber(12);
        oddEvenSeparator.addNumber(11);
        oddEvenSeparator.addNumber(9);
        oddEvenSeparator.even();
        oddEvenSeparator.odd();

        Table table = new Table(3, 3);
        table.setValue(1,0,46);
        table.setValue(1,1,30);
        table.setValue(2,1,14);
        System.out.println(table.average());

        Circle circle = new Circle(10);
        System.out.println("Area of circle = " + circle.area());
        circle.toString();

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Area of rectangle = " + rectangle.area());
        rectangle.toString();

        Cylinder cylinder = new Cylinder(circle, 5);
        System.out.println("Volume of cylinder = " + cylinder.volume());
    }


}
