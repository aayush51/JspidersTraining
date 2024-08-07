package default1;

class ClassA {
	
	int a = 8 ;
	static int b = 55 ;
	final int c = 95 ;
	static final int d = 100 ;
	int a1 ;
	static int b1 ;
//	final int c1 ; // The blank final field c1 may not have been initialized
//	static final int d1 ; // The blank final field d1 may not have been initialized
	
	ClassA() {
		System.out.println("NoArgConstructor");
	}
	
	ClassA(int a, int b, int c, int d) {
		this.a = a;
		this.b = b; //Warning-The static field ClassA.b should be accessed in a static way
//		this.c = c; //The final field ClassA.c cannot be assigned
//		this.d = d; //The final field ClassA.d cannot be assigned
	}		
	
	ClassA(int a, int b, int c, int d, int a1, int b1) {
		this.a = a;
		this.b = b; //Warning-The static field ClassA.b should be accessed in a static way
//		this.c = c; //The final field ClassA.c cannot be assigned
//		this.d = d; //The final field ClassA.d cannot be assigned
		this.a1 = a1 ;
		this.b1 = b1 ; ////Warning-The static field ClassA.b should be accessed in a static way
	}		


	void m1() {
		System.out.println("m1() from ClassA - NonStaticMethod");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a1);
		System.out.println(b1);
	}
	
	static void m2() {
		System.out.println("m2() from ClassA - StaticMethod");
		//Non static member can be accessed with object reference only in static context
		ClassA ca1 = new ClassA();
		System.out.println(ca1.a); //Cannot make a static reference to the non-static field a
		System.out.println(b);
		System.out.println(ca1.c); //Cannot make a static reference to the non-static field c
		System.out.println(d);
		System.out.println(ca1.a1); //Cannot make a static reference to the non-static field a1
		System.out.println(b1);
	}
	
	public String toString() {
		return "int a ="+a+", static int b ="+b+", final int c ="+c+", static final int d ="+d+", NotInit int a1="+a1+", NotInit static int b1="+b1;
	}
	
	public static void main(String[] args) {
		ClassA ca2 = new ClassA(1,2,3,4);
		System.out.println(ca2.toString());
		
	}
	

}
