package Inheritance.Hierarchical.GoogleAccount;

public class GoogleDriver {
	
	public static void main(String[] args)
	{
		System.out.println("----------------------GOOGLE ACCOUNT-------------------");
		GoogleAccount ga = new GoogleAccount("mahesh","mahesh12@gmail.com","mahesh123", 859564879, "mahesh@342");
		ga.displayGoogleAccountDetails();
		System.out.println("------------------------------------------------------");
		System.out.println("-------------------------YOUTUBE----------------------");
		YoutubeApp yt = new YoutubeApp("mahesh","mahesh12@gmail.com","mahesh123", 859564879, "mahesh@342","Entainment", 1000);
		yt.displayYoutubeAppDetails();
		System.out.println("------------------------------------------------------");
		System.out.println("-------------------------GMAIL----------------------");
		GmailApp gm = new GmailApp("mahesh","mahesh12@gmail.com","mahesh123", 859564879, "mahesh@342", 5, 2);
		gm.displayGmailAppDetails();
		System.out.println("------------------------------------------------------");
		System.out.println("----------------------GOOGLE PHOTOS-------------------");
		GooglePhotosApp gp = new GooglePhotosApp("mahesh","mahesh12@gmail.com","mahesh123", 859564879, "mahesh@342", 100, 50);
		gp.displayGooglePhotosAppDetails();
		System.out.println("------------------------------------------------------");
		
	}

}
