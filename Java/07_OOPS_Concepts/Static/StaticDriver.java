package Static;

public class StaticDriver extends StaticVar {
	
	public void display() {
		System.out.println(a);
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		
//		StaticVar obj1 = new StaticVar();
//
//		obj1.a = 20;
//		
//		System.out.println(obj1.a);
//		
//		StaticVar.a = 30;
//		
//		System.out.println(obj1.a);
//		
//		System.out.println(StaticVar.a);
//		
//		obj1.display();
		
		StaticDriver obj1 = new StaticDriver();
		
		obj1.a = 20;
		
		System.out.println(obj1.a);
		
		obj1.display();
		
		
		

		
	}

}
