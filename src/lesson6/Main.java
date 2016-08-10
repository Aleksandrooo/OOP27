package lesson6;

import lesson7.Number;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car1 = new Car("BMW" , 0.01, 50);
//		Car car1 = new Car("BMW" , 0.1, 50);
//		car1.model = "BMW";
//		car1.fuelConsumption = 0.1;
//		car1.maxTankVolume =50;
//		car1.currentFuel = 0;
//		car1.mileage = 3300;
//		
//		car1.SwitchOn = false;
//		
		//car1.printCarInfo();
		car1.fuelUp(20);
//        car1.fuelConsumption = -10;
//        car1.SwitchOn = true;
		car1.startTheCar();
		car1.driveTo(10);
        System.out.println(car1.getMileage());
//		
//		Integer in = 4; 
//		int i;
//		
//		i = in.intValue();
		
//		Number n = new  Number(30);
//		Number m;
//		Number s;
//
//		m = new  Number(50);
//		int i = m.get();
//		s = n.add(m);
//		System.out.println(s + " " + i);

	}

}
