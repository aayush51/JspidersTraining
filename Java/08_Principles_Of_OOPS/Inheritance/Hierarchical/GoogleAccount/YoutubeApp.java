package Inheritance.Hierarchical.GoogleAccount;

public class YoutubeApp extends GoogleAccount {
	String Profile;
	int WatchTime;
	
	public YoutubeApp() {

	}
	
	YoutubeApp(String name, String email, String username, long phnum, String password, String Profile, int WatchTime) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.phnum = phnum;
		this.password = password;
		
		this.Profile = Profile;
		this.WatchTime = WatchTime;
	}
	
	public void displayYoutubeAppDetails() {
		displayGoogleAccountDetails();
		System.out.println("Profile: " + Profile);
		System.out.println("Watch Time: " + WatchTime);
	}

}
