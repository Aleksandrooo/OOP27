package lesson9;

/**
 * Created by Admin on 15.08.2016.
 */
public class Rectangle extends Shape{
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        return sideA*sideB;
    }

    public double perim(){
        return 2*(sideA + sideB);
    }

    @Override
    public String toString(){
        return String.format("Rectangle Area: %5.2f  Perim: %5.2f", area(), perim());
    }

}
