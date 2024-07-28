package FinallyBlock;

public class FinallyEx4 {
	
	public static void main(String[] args) {
		System.out.println(10 / 0);
//		Unreachable code because of above statement throws an exception
//		finally block will not be executed in this case
		
		try {
			System.out.println(10);
		} 

		finally {
			System.out.println("From Finally Block");
		}
	}

}
