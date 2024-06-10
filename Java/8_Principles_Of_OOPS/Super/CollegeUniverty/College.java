package Super.CollegeUniverty;

public class College extends University {
	
	String ColName;
    long ColCode;
    String Collocation;
    String princi;
    
	public College(String name, long Code, String location, String viceChancellor, String ColName, long ColCode,
			String Collocation, String principal) {
		super(name, Code, location, viceChancellor);
		this.ColName = ColName;
		this.ColCode = ColCode;
		this.Collocation = Collocation;
		princi = principal;
	}
	
	public void displayCollege() {
		displayUniversity();
		System.out.println("Name: " + ColName);
		System.out.println("Code: " + ColCode);
		System.out.println("Location: " + Collocation);
		System.out.println("Principal: " + princi);
	}
    
    
    

}
