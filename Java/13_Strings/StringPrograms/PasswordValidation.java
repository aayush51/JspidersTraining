package StringPrograms;
import java.util.*;
public class PasswordValidation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password :");
		String pass = sc.next();
		if(pass!=null && pass.length()>=8) {
			int upper = 0 , lower = 0 , digit = 0 , spl = 0 ;
			for(int i = 0 ; i < pass.length() ; i++) {
				char ch = pass.charAt(i);
				if(ch >= 'a' && ch <= 'z') {
					lower++;
				}
				else if(ch >= 'A' && ch <= 'Z') {
					upper++;
				}
				else if(ch >= '0' && ch <= '9') {
					digit++;
				}
				else {
					spl++;
				}
			}
			if(upper>0 && lower>0 && digit>0 && spl>0) {
				System.out.println("Strong Password");
			}
			else {
				System.out.println("Weak Password");
			}
		}
		else {
			System.out.println("Enter Valid Password");
		}
		sc.close();
	}

}
