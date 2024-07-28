package BasicsOfString;

public class replaceStr {
	public static void main(String[] args) {
		String str = "Aeroplane";
		String replacement = "Aero";
		String ans = str.replace(replacement+"", "");
		System.out.println(ans);
	}

}
