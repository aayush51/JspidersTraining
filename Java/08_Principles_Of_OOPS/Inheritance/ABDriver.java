package Inheritance;

public class ABDriver {
	public static void main(String[]args)
	{
		B b1 = new B();
		System.out.println(b1.x);
		System.out.println(b1.s);
		b1.demo();
		b1.test();
	}
}
