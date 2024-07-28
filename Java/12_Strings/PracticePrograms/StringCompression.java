package PracticePrograms;

public class StringCompression {
	
	public static String compressString(String str) {
		String result = "";
		for (int i = 0; i < str.length();i++) {
			int count = 1 ;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			result += str.charAt(i) ;
			if (count>1) {
				result+=count;
			}		
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "abbbbbbbbbbbccccc";
		System.out.println(compressString(s));
	}

}
