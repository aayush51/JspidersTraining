package StringPrograms;

public class PanagramString {
	
	public static void main(String[] args) {
		
		String ip = "Go, lazy fat vixen; be shrewd, jump quick.";
		ip=ip.toUpperCase();
		int [] check = new int[26];
		for (int i = 0; i < ip.length() ; i++) {
			char ch = ip.charAt(i);
			if (ch>='A' && ch<='Z') {
				check[ch-65]++;
			}
		}
		int i = 0;
		for (; i < check.length ; i++) {
			if (check[i]==0) {
				break;
			}
		}
		if(i==check.length) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not a Panagram");
		}
	}
}



//The five boxing wizards jump quickly.
//Pack my box with five dozen liquor jugs.
//Go, lazy fat vixen; be shrewd, jump quick.
//When zombies arrive, quickly fax Judge Pat.
//Amazingly few discotheques provide jukeboxes.
//Puzzled women bequeath jerks very exotic gifts.


