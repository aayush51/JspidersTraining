package ConstructorChaining;

public class FormDriver {

	public static void main(String[] args) {
            Form f1 = new Form();
            f1.displayForm();
            
            System.out.println("-------------------------------------------");
            
            Form f2 = new Form("Mahesh","m@gmail.com", 9876543210L, "Kolhapur", "B+", 5.8, 70);
            f2.displayForm();
            
            System.out.println("-------------------------------------------");
            
            Form f3 = new Form("Mahesh","m@yahoo.com");
            f3.displayForm();

	}
}