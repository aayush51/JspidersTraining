package VisionWaves;

public class Q08 extends Stud {
	
//	Q8] Can we declare constructor as private , If yes then how can we perform instantiation for 
//	private constructor

	public static void main(String[] args) {
		
		Stud s1 = createObject(22,33);
		System.out.println(s1);
		
	}

}

class Stud {
	int x;
	int y;
	
	private Stud(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static Stud createObject(int x, int y) {
		return new Stud(x, y);
	}
	
	public String toString() {
		return "Marks: " + this.x + "," + this.y ;
	}
}
