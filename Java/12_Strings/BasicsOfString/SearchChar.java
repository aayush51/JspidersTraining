package BasicsOfString;

public class SearchChar {
	public static void main(String[] args) {
		String s = "Aeroplane";
		char search = 'a';
		int i ;
		for (i = 0; i < s.length() ; i++) {
			if(s.charAt(i)==search) {
				break;
			}
		}
		if(i == s.length() - 1) {
			System.out.println("Not found !");
		}
		else
		{
			System.out.println("Found at " + (i+1) + " th position");
		}
	}
}
