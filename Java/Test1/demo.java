
public class demo {

	public static void main(String[] args) {
		
		
		

		// highest permutation and combination of words without vowels

//		String[] words = new String[] { "hello","ramesh","ayush"};
//		int max = 0 ;
//		for (String i : words) {
//			i = i.replaceAll("[aeiou]", "");
//			if(max<i.length()) {
//				max = i.length();
//			}
//		}
//		int fact = 1;
//		for(int i=0; i<=max; i++) {
//			fact *= i ;
//		}
//		System.out.println(fact);
		
		
		
		

		// remove all characters from the string

		String ip1 = "AABBBBCC";
		String ip2 = "AB";
		for (char c : ip2.toCharArray()) {
			ip1 = ip1.replaceAll(c + "", ip2);
		}
		if (ip1.length() == 0) {
			System.out.println("none");
		}
	}

}
