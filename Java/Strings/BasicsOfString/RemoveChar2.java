package BasicsOfString;

public class RemoveChar2 {
	public static void main(String[] args) {
		String s = "Aeroplane";
		char search = 'a';
		String ans = "";
		
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i) != search) {
				ans+= s.charAt(i);
			}
		}
		
		System.out.println(ans);
	}

}
