package VisionWaves;

public class Q11 {
	
//	Q11] Can we call methods in multi-line block (Static Block)
//	Yes
	
	static
	{
		System.out.println("Static Block Started");
		printNum();
		System.out.println("Static Block Ended");
	}
	
	public static void printNum() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		printNum();
		System.out.println("Main End");
	}

}
