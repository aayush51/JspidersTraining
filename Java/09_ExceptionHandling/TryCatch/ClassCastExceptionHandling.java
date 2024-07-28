package TryCatch;

public class ClassCastExceptionHandling {

	
	public static void main(String[] args) {
        FatherClass f1 = new FatherClass();
		try {
			SonClass s = (SonClass) f1;
			s.smoke();
			s.drink();
		} catch (ClassCastException e) {
			System.out.println("Father cannot be cast to Son");
		}
	}
}
