package VisionWaves;

class Q09 {
	
//	Q9] Can we declare class as private 
	
//	Error If class made private -
//	Illegal modifier for the class Q9; only public, abstract & final are permitted
	
	private class myClass {
		int a ;
		int b ;
		private void printNum() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
