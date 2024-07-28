package BasicsOfString;

public class RemoveChar1 {
	public static void main(String[] args) {
		String s = "Aeroplane";
		char search = 'a';
		String ans = s.replace(search+""+"", "");
		System.out.println(ans);
	}

}
