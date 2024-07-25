package ExceptionTypes;

public class ClassCastExc {

	
	public static void main(String[] args) {
        FatherClass f1 = new FatherClass();
        SonClass s1 = (SonClass) f1; // This will throw ClassCastException
        s1.smoke();
        s1.drink();
	}
}
