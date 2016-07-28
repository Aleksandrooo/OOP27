package lesson6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("BMW" , 0.1, 50);
		car1.model = "BMW";
		car1.fuelConsumption = 0.1;
		car1.maxTankVolume =50;
		car1.currentFuel = 0;
		car1.mileage = 3300;
		
		car1.SwitchOn = false;
		
		car1.printCarInfo();
		car1.fuelUp(20);
		car1.startTheCar();
		car1.driveTo(10);
		
		

	}

}
