package Inheritance.Hierarchical.GoogleAccount;

public class GmailApp extends GoogleAccount {
	int InboxCount;
	int UnreadCount;
	
	public GmailApp() {

	}
	
	GmailApp(String name, String email, String username, long phnum, String password, int InboxCount, int UnreadCount) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.phnum = phnum;
		this.password = password;

		this.InboxCount = InboxCount;
		this.UnreadCount = UnreadCount;
	}
	
	public void displayGmailAppDetails() {
		displayGoogleAccountDetails();
		System.out.println("Inbox Count: " + InboxCount);
		System.out.println("Unread Count: " + UnreadCount);
	}
	

}
