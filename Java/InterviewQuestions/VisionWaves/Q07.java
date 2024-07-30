package VisionWaves;

public class Q07 {
	
//	Q7] Can we overload main method
	
	public static void main(String[] args) {
		System.out.println("Starting Main(String[] args)");
		main();
		main(5);
		System.out.println("Finished Main(String[] args)");
	}
	public static void main() {
		System.out.println("Starting Main()");
		System.out.println("Finished Main()");
	}
	public static void main(int a) {
		System.out.println("Starting Main(int a) "+a);
		System.out.println("Finished Main(int a)");
	}
}
