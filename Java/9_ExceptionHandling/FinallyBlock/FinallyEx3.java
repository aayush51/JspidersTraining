package FinallyBlock;

public class FinallyEx3 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} 

		finally {
			System.out.println("From Finally Block");
		}
	}
}
