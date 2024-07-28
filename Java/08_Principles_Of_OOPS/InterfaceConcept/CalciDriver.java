package InterfaceConcept;

public class CalciDriver {
	
	public static void main(String[] args) {
		Calculator c1 = new CalciImp("C1", "Casio", 1500);
		System.out.println(c1.add(10, 20));
		System.out.println(c1.subtract(50, 20));
		System.out.println(c1.multiply(15, 5));
		System.out.println(c1.divide(5, 20));
		System.out.println(c1.areaOfCircle(10));
//		c1.ad();
	}

}
