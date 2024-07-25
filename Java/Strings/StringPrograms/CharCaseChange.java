package StringPrograms;

public class CharCaseChange {
	
	public static String changeCase(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				result += (char)(s.charAt(i)-32);
			}
			else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				result += (char)(s.charAt(i)+32);
			}
			else {
				result += s.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "iNdiA IS AwEsOme";
		System.out.println(changeCase(str));
	}

}
