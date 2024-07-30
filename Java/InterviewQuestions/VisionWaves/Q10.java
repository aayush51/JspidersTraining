package VisionWaves;

public class Q10 {

//	Q10] Can we make class as static
//	No
	static class Stud{
		int mark1;
		int mark2;
		
		public Stud(int mark1, int mark2) {
			super();
			this.mark1 = mark1;
			this.mark2 = mark2;
		}
	}
	
	public static void main(String[] args) {
		Stud s = new Stud(81,79);
		System.out.println(s.mark1);
		System.out.println(s.mark2);
	}
	
}
