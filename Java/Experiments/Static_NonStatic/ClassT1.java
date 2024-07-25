package Static_NonStatic;

public class ClassT1 {
	int a = 881 ;
	static int b = 991 ;
	
	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void m2() {
		ClassT1 t1 = new ClassT1();
		System.out.println(t1.a);
		System.out.println(b);
	}

}
