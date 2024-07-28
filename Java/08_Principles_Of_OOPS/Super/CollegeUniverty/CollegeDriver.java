package Super.CollegeUniverty;

public class CollegeDriver {

	public static void main(String[] args) {
		College c = new College("SPPU", 411007, "Pune", "Nitin Karmalkar", "COEP", 411005, "Pune", "B.B Ahuja");
		c.displayCollege();
		
		System.out.println("--------------------------------------------");
		
		c.displayUniversity();
		
	}
}
