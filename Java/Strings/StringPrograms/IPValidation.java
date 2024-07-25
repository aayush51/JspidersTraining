package StringPrograms;
//import java.util.Arrays;
import OperationsOnString.SplitToWords;

public class IPValidation {
	
	public static void main(String[] args) {
		String ip = "192.187.69.06";
		String[] nums = SplitToWords.splitToWords(ip, '.');
		if(nums.length == 4) {
			try {
				int i = 0 ;
				for(;i<nums.length;i++) {
					@SuppressWarnings("unused")
					int num = Integer.parseInt(nums[i]);
					if(nums[i].length() > 3) {
						System.out.println("Invalid IP "+ip);
						break;
					}
				}
				if(i == nums.length) {
					System.out.println("Valid IP "+ip);
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid IP "+ip);
			}
		}
		else
		{
			System.out.println("Invalid IP "+ip);
		}
	}

}
