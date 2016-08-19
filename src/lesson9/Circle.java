package lesson9;

/**
 * Created by Admin on 15.08.2016.
 */
public class Circle extends Shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius*radius*Math.PI;
    }

    @Override
    public double perim(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString(){
        return String.format("Circle Area: %5.2f  Perim: %5.2f", area(), perim());
    }
}
