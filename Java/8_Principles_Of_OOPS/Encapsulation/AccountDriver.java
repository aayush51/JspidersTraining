package Encapsulation;

public class AccountDriver {
	
	public static void main(String[] args) {
        Account a1 = new Account("SBI", "Kolkata", "Rahul", 1234567890, 10000, 1234);
        
        a1.displayAccountDetails();        
        System.out.println("----------------------------------------------");

        a1.withdraw(1234567890, 1234, 5000);
        a1.displayAccountDetails();        
        System.out.println("----------------------------------------------");

        a1.withdraw(1234567890, 1234, 7000);
        a1.displayAccountDetails();        
        System.out.println("----------------------------------------------");

        a1.deposit(1234567890, 1234, 5000);
        a1.displayAccountDetails();        
        System.out.println("----------------------------------------------");

        a1.deposit(1234567890, 1234, -5000);
        a1.displayAccountDetails();        
        System.out.println("----------------------------------------------");
        
        a1.setPin(1234567890,1234, 4321);
        
        
        System.out.println("----------------------------------------------");

        a1.deposit(1234567890, 4321, 15999);
        
        
	}

}
