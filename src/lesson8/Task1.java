package lesson8;

import lesson6.Car;

/**
 * Created by Admin on 09.08.2016.
 */
public class Task1 {
     public static void main ( String[] args){

         Truck truck1 =new Truck("Kamaz", 0.2, 2, 10);
         Car truck2 = new Truck("qq", 0.1, 34, 5);

         truck1.driveTo(10);

         //System.out.println("Hello word");


     }
}
