package StringPrograms;

public class ReplaceChar {
	
	public static String replaceChar(String str ,char source , char replacement) {
		char[] chars = str.toCharArray();
		String ans="";
		for(int i = 0; i < chars.length ; i++) {
			if(chars[i]==source || chars[i]==(source-32)) {
				chars[i] = replacement;
			}
			ans+=chars[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "India is Very Beautiful Country";
		
//		replaceChar(s, 'V', 'N');
//		System.out.println(s);
		
		System.out.println(replaceChar(s, 'i', 'N'));
	}

}
