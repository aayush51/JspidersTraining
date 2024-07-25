package ExceptionTypes;

public class DemoClass1 {
	int a = 881;
	static int b = 991;

	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void m2() {
		DemoClass1 t1 = new DemoClass1();
		System.out.println(t1.a);
		System.out.println(b);
	}

//	public static void main(String[] args) {
//		m2();
//	}

}
