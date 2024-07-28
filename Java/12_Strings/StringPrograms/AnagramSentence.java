package StringPrograms;

public class AnagramSentence {
	
	public static void main(String[] args) {
		String s1 = "a gentleman";
		String s2 = "elegant man";
		int[] ch1 = new int[127];
		int[] ch2 = new int[127];
		for(int i=0; i<s1.length(); i++) {
			ch1[s1.charAt(i)]++;
			ch2[s2.charAt(i)]++;
		}
		int i = 0;
		for(; i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				break;
			}
		}
		if(i==ch1.length) {
			System.out.println("it is anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}
}
