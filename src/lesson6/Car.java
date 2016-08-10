package lesson6;

public class Car {
	private String model;
	private double fuelConsumption;
	private int mileage;
	private int maxTankVolume;
	private double currentFuel;
	private boolean SwitchOn;
	
	public Car(String model, double fuelConsumption, int maxTankVolume){
		if(model != null){
			this.model = model;
			this.fuelConsumption = fuelConsumption;
			this.maxTankVolume = maxTankVolume;
		}
	}

	public double getCurrentFuel(){
		return  currentFuel;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public int getMileage(){
		return mileage;
	}

	public void driveTo(double distanceInKM){
		if(SwitchOn == true){
			if(currentFuel >= distanceInKM/fuelConsumption){
				currentFuel = currentFuel - distanceInKM/fuelConsumption;
				mileage += distanceInKM;
				System.out.println(" Я  еду !");
			} else {
				currentFuel = 0;
				mileage += currentFuel/fuelConsumption;
				SwitchOn = false;
			}
			
		} else {
			System.out.println("Машина не заведена!");
		}
	}
	
	public void fuelUp(int valueOfFuel){ 
		if(valueOfFuel + currentFuel >= maxTankVolume ){
			currentFuel = maxTankVolume;
		} else {
			currentFuel += valueOfFuel;
		}
	}
	
	public void  startTheCar (){
		if(SwitchOn == true){
			System.out.println("Машина уже заведена!");
		} else {
			if(currentFuel >0){
				SwitchOn = true;
			} else {
				System.out.println("Нет топлива!");
			}
		}
	}
	
	public void  printCarInfo (){
		System.out.printf("Model - %s Fuel_Consumption - %4.2f mileage - %d  maxTankVolume - %d  currentFuel - %4.2f  SwitchOn - %b%n",model, fuelConsumption, mileage, maxTankVolume, currentFuel, SwitchOn);
		//System.out.println(String.format(format, args));
	}
	
	

}
