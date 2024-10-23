package loose_coupling;

public class BikeDriver {
	
	public static void main(String[] args) {
		
		Ride ride = new Ride();		
		ride.vehicle = new Car();	// here we decide which object to create
		ride.startRide();
	}

}
