package geometry3d;


import exceptions.CylinderException;
import exceptions.HeightException;
import geometry2d.Circle;
import geometry2d.Figure;

public class Cylinder {
    Figure base;
    double height;

    public void setBase(Figure base){
        try {
            if (!(base instanceof Circle)) throw new CylinderException("Base of cylinder should be circle");
            else this.base = base;
        } catch (CylinderException e){
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

    public Cylinder(Figure base, double height){
        setBase(base);
        setHeight(height);
    }

    public double Volume(){
        double volume = height * base.area();
        System.out.println("Volume of circle = " + volume);
        return volume;
    }
}
