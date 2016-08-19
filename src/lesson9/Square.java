package lesson9;

/**
 * Created by Admin on 15.08.2016.
 */
public class Square extends Rectangle {
    public  Square (double side){
        super(side, side);
    }

    @Override
    public String toString(){
        return String.format("Square  Area: %5.2f  Perim: %5.2f", area(), perim());
    }
}
