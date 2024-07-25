package BasicsOfString;

public class NumOfWords {
	public static void main(String[] args) {
		String s = "Java is Boring";
		
//		String [] words = s.split(" ");
//		System.out.println(words.length);
		
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);
	}

}
