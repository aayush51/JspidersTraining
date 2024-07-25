package ObjectClass;

public class ACDriver {

	public static void main(String[] args) {
		// Creating objects of AirConditioner class with same Attributes
		AirConditioner ac1 = new AirConditioner("LG", 50000, 30, 18, "Cool");
		AirConditioner ac2 = new AirConditioner("LG", 50000, 30, 18, "Cool");
		AirConditioner ac3 = new AirConditioner("Samsung", 60000, 30, 18, "Cool");
		AirConditioner ac4 = new AirConditioner("Samsung", 60000, 30, 18, "Cool");
		AirConditioner ac5 = new AirConditioner("Samsung", 60000, 30, 18, "Cool");
		System.out.println(ac1.toString());
		System.out.println(ac2.toString());
		System.out.println(ac1.equals(ac2));
		System.out.println(ac3.equals(ac4));
		System.out.println(ac4.equals(ac5));
		System.out.println(ac1.hashCode());
		System.out.println(ac2.hashCode());
		System.out.println(ac3.hashCode());
		System.out.println(ac4.hashCode());
		System.out.println(ac5.hashCode());
		System.out.println("-------------------------------------------------------------");
		// Creating objects of AirConditioner class with different Attributes
		AirConditioner ac6 = new AirConditioner("LG", 50000, 30, 18, "Cool");
		AirConditioner ac7 = new AirConditioner("LG", 60000, 30, 18, "Cool");
		System.out.println(ac6.toString());
		System.out.println(ac7.toString());
		System.out.println(ac6.equals(ac7));
		System.out.println(ac6.hashCode());
		System.out.println(ac7.hashCode());
		System.out.println("-------------------------------------------------------------");
		
	}

}
