package InterfaceConcept;

public interface Calculator {
	
	double pi = 22.0/7.0;
	
	public static final double pi1 = 22.0/7.0;
	
	int add(int a, int b);
	
	public abstract int subtract(int a, int b);
	
	public int multiply(int a, int b);
	
	public int divide(int a, int b);
	
	public double areaOfCircle(int radius);
	
//	private int a =	2;
//	int a = 2 ;
//	default void ad()
//	{
//		System.out.println("Default method in interface a="+a);
//	}

}
