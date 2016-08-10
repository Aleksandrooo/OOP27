package lesson8;

import lesson6.Car;

/**
 * Created by Admin on 09.08.2016.
 */
public class Truck extends Car {
    private  int payLoad;

    public Truck(String model, double fuelConsumption, int maxTankVolume, int payLoad) {
        super(model, fuelConsumption, maxTankVolume);
        this.payLoad = payLoad;

    }
}
