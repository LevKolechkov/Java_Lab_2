package geometry2d;

import exceptions.RadiusException;

public class Circle implements Figure {
    double radius;

    public void setRadius(double radius){
        try {
            if(radius <= 0) throw new RadiusException("Radius must be higher than zero");
            else this.radius = radius;
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Double area() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "radius = " + this.radius;
    }
}
