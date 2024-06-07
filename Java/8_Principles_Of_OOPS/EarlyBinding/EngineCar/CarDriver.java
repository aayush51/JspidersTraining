package EarlyBinding.EngineCar;

public class CarDriver {
	
	public static void main(String[] args) {
		Engine e1 = new Engine("BMW", 200, 5000);
		Car c1 = new Car("BMW", "X5", 50000, e1);
		c1.displayCar();
	}

}

