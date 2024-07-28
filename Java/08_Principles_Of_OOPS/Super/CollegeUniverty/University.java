package Super.CollegeUniverty;

public class University {
	String name;
	long Code;
	String location;
	String viceChancellor;
	
	public University(String name, long Code, String location, String viceChancellor) {
        this.name = name;
        this.Code = Code;
        this.location = location;
        this.viceChancellor = viceChancellor;
	}
	
	public void displayUniversity() {
		System.out.println("Name: " + name);
		System.out.println("Code: " + Code);
		System.out.println("Location: " + location);
		System.out.println("Vice Chancellor: " + viceChancellor);
	}

}
