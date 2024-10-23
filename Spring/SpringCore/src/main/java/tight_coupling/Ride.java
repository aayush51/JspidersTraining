package tight_coupling;

public class Ride {
	Bike bike = new Bike();
	public void startRide() {
		bike.start();
	}
	// Ride Class is dependent on Bike Class
}
