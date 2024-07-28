
package Inheritance.SingleLevel;

public class BankAccount {
	String name;
	int accNum;
	String branch;
	String ifsc;
	String bankName;
	
	public BankAccount() {
	}
	
	public BankAccount(String name, int accNum, String branch, String ifsc, String bankName) {
		this.name = name;
		this.accNum = accNum;
		this.branch = branch;
		this.ifsc = ifsc;
		this.bankName = bankName;
	}

	public void displayBankAccountDetails() {
		System.out.println("Name: " + name );
		System.out.println("Account Number: " + accNum );
		System.out.println("Branch: " + branch );
		System.out.println("IFSC: " + ifsc );
		System.out.println("Bank Name: " + bankName );
	}
	
}
