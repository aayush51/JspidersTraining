package StringPrograms;

public class MaxRepeatedSubsequence {
	
	public static void main(String[] args) {
		String s = "aaaababbbbabccsbssscbabsacbascbacabbbbcass";
		int max = 0 , index = 0 , count = 0 ;
		for(int i = 0 ; i < s.length()-1 ; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
					index=i;
				}
				count=0;
			}
		}
		System.out.println(s.charAt(index)+" repeated "+(max+1)+" times");
	}

}
