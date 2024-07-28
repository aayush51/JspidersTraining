package Inheritance.SingleLevel;

public class AccountDriver {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Mahesh Mohite", 123456, "Pune", "SBIN0001234", "SBI", 5000, 4.5);
		sa.displaySavingsAccountDetails();
		
		System.out.println("-----------------------------------------------------------");
		
		sa.displayBankAccountDetails();
	}
}
