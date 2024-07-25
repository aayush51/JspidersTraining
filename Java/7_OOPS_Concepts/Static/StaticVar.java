package Static;

public class StaticVar {
	static int a = 10;
	
	public void display() {
		System.out.println(StaticVar.a);
	}

	public static void main(String[] args) {
		StaticVar obj1 = new StaticVar();
		StaticVar obj2 = new StaticVar();
		obj1.a = 20;
		StaticVar.a = 30;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}

}
