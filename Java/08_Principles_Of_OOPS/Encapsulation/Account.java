package Encapsulation;

public class Account {
	private String bankName;
	private String branchName;
	private String customerName;
	private long accountNumber;
	private double balance;
	private int pin;

	public Account() {

	}

	public Account(String bankName, String branchName, String customerName, long accountNumber, double balance,
			int pin) {
		this.bankName = bankName;
		this.branchName = branchName;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public String getBankName() {
		return bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance(long accountNumber, int pin) {
		if (this.accountNumber == accountNumber && this.pin == pin) {
			return balance;
		} else {
			System.out.println("Invalid account number or pin");
			return 0;
		}
	}
	
	public void withdraw(long accountNumber, int pin, double amount) {
		if (this.accountNumber == accountNumber && this.pin == pin) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.out.println("Amount withdrawn successfully");
				System.out.println("Remaining balance: " + balance);
			} else {
				System.out.println("Invalid amount");
			}
		} else {
			System.out.println("Invalid account number or pin");
		}
	}
	
	public void deposit(long accountNumber, int pin, double amount) {
		if (this.accountNumber == accountNumber && this.pin == pin) {
			if (amount > 0) {
				balance += amount;
				System.out.println("Amount deposited successfully");
				System.out.println("Updated balance: " + balance);
			} else {
				System.out.println("Invalid amount");
			}
		} else {
			System.out.println("Invalid account number or pin");
		}
	}

	public void setPin(long accountNumber, int OldPin, int NewPin) {
		if (this.accountNumber == accountNumber && this.pin == OldPin) {
			this.pin = NewPin;
			System.out.println("Pin changed successfully");
		} else {
			System.out.println("Invalid account number or pin");
		}
	}

	public void displayBalance() {
		System.out.println("Bank Name: " + this.bankName);
		System.out.println("Branch Name: " + this.branchName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Balance: " + this.balance);
	}
	
	public void displayAccountDetails() {
		System.out.println("Bank Name: " + this.bankName);
		System.out.println("Branch Name: " + this.branchName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Balance: " + this.balance);
	}

}
