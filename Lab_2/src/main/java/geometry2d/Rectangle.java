package geometry2d;

import exceptions.HeightException;
import exceptions.WidthException;

public class Rectangle implements Figure{
    double width;
    double height;

    public void setWidth(Double width) {
        try {
            if (width <= 0) throw new WidthException("Width must be higher than zero");
            else this.width = width;
        } catch (WidthException e) {
           System.out.println(e.getMessage());
        }
    }

    public void setHeight(Double height) {
        try {
            if (height <= 0) throw new HeightException("Height must be higher than zero");
            else this.height = height;
        } catch (HeightException e) {
            System.out.println(e.getMessage());
        }
    }

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    @Override
    public Double area() {
        double area = width * height;
        System.out.println("Area of rectangle = " + area);
        return area;
    }

    @Override
    public String toString() {
        return "width = " + this.width + "\nheight = " + this.height;
    }
}
