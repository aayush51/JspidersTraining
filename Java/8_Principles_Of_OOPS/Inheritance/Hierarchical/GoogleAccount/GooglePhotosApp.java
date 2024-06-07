package Inheritance.Hierarchical.GoogleAccount;

public class GooglePhotosApp extends GoogleAccount {
	
	int Storage;
	int PhotosCount;

	public GooglePhotosApp() {

	}

	GooglePhotosApp(String name, String email, String username, long phnum, String password, int Storage,
			int PhotosCount) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.phnum = phnum;
		this.password = password;

		this.Storage = Storage;
		this.PhotosCount = PhotosCount;
	}

	public void displayGooglePhotosAppDetails() {
		displayGoogleAccountDetails();
		System.out.println("Storage: " + Storage);
		System.out.println("Photos Count: " + PhotosCount);
	}
	
}
