package VisionWaves.Q15;

public class child extends parent {
	
	private void driving() {
		System.out.println("Child driving");
	}
	
	public static void main(String[] args) {
		parent c1 = new child();
		c1.driving(); //The method driving() from the type parent is not visible
	}
}
