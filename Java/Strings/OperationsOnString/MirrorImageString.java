package OperationsOnString;

public class MirrorImageString {
	
	public static boolean IsMirror(String str1, String str2) {
		boolean isMirror = false;
		int count = 0 ;
		for(int i = 0, j = str2.length()-1; i < str1.length(); i++,j--) {

			if(str1.charAt(i) == str2.charAt(j)) {
				count++;
			}
			else {
				break;
			}

		}
		if(count == str1.length()) {
			isMirror = true;
		}
		return isMirror;
	}
	
	public static void main(String[] args) {
		String string1 = "hellop";
		String string2 = "lolleh";
		System.out.println(IsMirror(string1, string2));
	}

}
