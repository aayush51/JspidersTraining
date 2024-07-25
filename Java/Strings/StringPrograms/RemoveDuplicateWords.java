package StringPrograms;

public class RemoveDuplicateWords {
	
	public static String removeDuplicateWords(String str) {
		String ans = "";
		String[] words = str.split(" ");
		for (int i = 0 , j ; i < words.length; i++) {
			for (j = i+1 ; j < words.length; j++) {
				if((words[i].equalsIgnoreCase(words[j]))) {
					break;
				}
			}
			if(j == words.length)
			{
				ans+=words[i]+" ";
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "How fine Hello Hello How are you are you fine hello";
		System.out.println(removeDuplicateWords(s));
	}

}
