package Inheritance.SingleLevel;

public class SavingsAccount extends BankAccount{
	double balance;
	double interestRate;
	
	public SavingsAccount() {
	}
	
	public SavingsAccount(String name, int accNum, String branch, String ifsc, String bankName, double balance,
			double interestRate) {
		this.name = name;
		this.accNum = accNum;
		this.branch = branch;
		this.ifsc = ifsc;
		this.bankName = bankName;

		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void displaySavingsAccountDetails() {
		displayBankAccountDetails();
		System.out.println("Balance: " + balance);
		System.out.println("Interest Rate: " + interestRate);
	}
}
