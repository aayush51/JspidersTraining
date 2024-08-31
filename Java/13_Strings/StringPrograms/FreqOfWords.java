package StringPrograms;

//import java.util.Arrays;

public class FreqOfWords {
	
	public static String[] splitToWords(String str,char ch) {
		String[] words = new String[countOfWords(str,ch)];
		for (int i = 0 , j = 0; i < words.length; i++) {
			String ans = "";
			for (; j < str.length(); j++) {
				if(str.charAt(j) == ch) {
					j++;
					break;
				}
				else {
					ans+=str.charAt(j);
				}
			}
			words[i] = ans;
		}
		return words;
	}
	
	public static int countOfWords(String str,char ch) {
		int count = 0, i = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i)==ch) {
				count++;
			}
		}
		if(str.isEmpty()) {
			return 0;
		}
		if(count>0) {
			return count+1;
		}
		else {
			return 1;
		}
	}
	
	public static int[] getCount(String[] w) {
		int[] count = new int[w.length];
		for(int i = 0 ; i < w.length ; i++)
		{
			int ct = 0 ;
			for(int j=i+1 ; j < count.length ; j++) 
			{
				if(count[i]==-1)
				{
					break;
				}
				else if(w[i].equalsIgnoreCase(w[j])) {
					ct++;
					count[j]=-1;
				}
			}
			if(count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String paragraph = "India is a big country in South Asia India has a lot of people many people  India has many cities and many villages India has many languages many many languages";
		String[] w = splitToWords(paragraph,' ');
		int[] h = getCount(w);
//		System.out.println(Arrays.toString(h));
		int index = 0 , mindex = 0 ; 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<h.length; i++)
		{	
			if(max<h[i])
			{
				max=h[i];
				index=i;
			}
			if(min>h[i] && h[i]!=-1){
				min=h[i];
				mindex=i;
			}
		}
		System.out.println("Highly Repeated Word : "+w[index]);
		System.out.println("Least Repeated Word : "+w[mindex]);
		
	}

}
