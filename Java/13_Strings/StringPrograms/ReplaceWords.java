package StringPrograms;

public class ReplaceWords {
	
	public static String replaceStr(String string,String source,String replacement) {
		String[] words = string.split(" ");
		String result = "";
		for(int i = 0; i < words.length; i++) {
			if(source.equals(words[i])) {
				if(i==words.length-1) {
					result+=replacement;
				}
				else {
					result+=replacement + " ";
				}
			}
			else {
				if(i==words.length-1) {
					result+=words[i];
				}
				else {
					result+=words[i] + " ";
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {

		String s = "How fine Hello Hello How are you are you fine hello";
		System.out.print(replaceStr(s,"How","Why"));
	}

}
