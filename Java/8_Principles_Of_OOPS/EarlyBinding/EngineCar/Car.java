package EarlyBinding.EngineCar;

public class Car {
	String CarName;
	String CarModel;
	double CarPrice;
	Engine e1;
	
	public Car() {

	}
	
	Car(String CarName, String CarModel, double CarPrice, Engine e1) {
		this.CarName = CarName;
		this.CarModel = CarModel;
		this.CarPrice = CarPrice;
		this.e1 = e1;
	}
	
	public void displayCar() {
		System.out.println("Car Name: " + CarName);
		System.out.println("Car Model: " + CarModel);
		System.out.println("Car Price: " + CarPrice);
		e1.displayEngine();
	}

}
