package Inheritance.Hierarchical.GoogleAccount;

public class GoogleAccount {
	String name;
	String email;
	String username;
	long phnum;
	String password;
	
	public GoogleAccount()
	{

	}
	
	GoogleAccount(String name, String email, String username, long phnum, String password) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.phnum = phnum;
		this.password = password;
	}
	
	public void displayGoogleAccountDetails() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Username: " + username);
		System.out.println("Phone Number: " + phnum);
		System.out.println("Password: " + password);
	}
}
