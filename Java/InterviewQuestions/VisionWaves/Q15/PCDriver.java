package VisionWaves.Q15;

public class PCDriver {
	
//	Q15] Can we override private methods in java
//	No
	
	public static void main(String[] args) {
		
		parent p = new child();
//		p.driving();
		System.out.println(p instanceof parent);
		System.out.println(p instanceof child);
		
	}
	
}
