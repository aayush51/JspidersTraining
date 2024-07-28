package StringPrograms;

public class SumOfDigits {
	
	public static void main(String[] args) {
		String s = "t4oir5rft311h6gfu";
		int sum=0;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				sum+=(c-48);
			}
		}
		System.out.println(sum);
	}
}
