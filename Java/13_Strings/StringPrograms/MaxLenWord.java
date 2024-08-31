package StringPrograms;

public class MaxLenWord {
	
	public static void main(String[] args) {
		String s = "India is my country";
		String[] ar = s.split(s);
		int max = 0 , index = 0 ;
		for (int i = 0 ; i < ar.length ; i++) {
			if (ar[i].length() > max) {
				max = ar[i].length();
				index=i;
			}
		}
		System.out.println(ar[index]);
	}
}
