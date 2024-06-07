package NonStatic;

public class MarkerDriver {
	
	static String s = "marker";
	
	public static void main(String[] args) {
		Marker m1 = new Marker();
		m1.displayMarker();

		System.out.println("-------------------------------------------");

		Marker m2 = new Marker("Cello", "Blue", 50);
		m2.displayMarker();
		
		System.out.println(s);
	}

}
