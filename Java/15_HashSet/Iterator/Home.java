package Iterator;

public class Home {
	
	int noOfRooms;
	String address;
	boolean isFurnished;
	String type;
	double rent;
	double deposit;
	
	
	public Home(int noOfRooms, String address, boolean isFurnished, String type, double rent, double deposit) {
		super();
		this.noOfRooms = noOfRooms;
		this.address = address;
		this.isFurnished = isFurnished;
		this.type = type;
		this.rent = rent;
		this.deposit = deposit;
	}


	@Override
	public String toString() {
		return "Home [noOfRooms=" + noOfRooms + ", address=" + address + ", isFurnished=" + isFurnished + ", type="
				+ type + ", rent=" + rent + ", deposit=" + deposit + "]";
	}
	
	

}
