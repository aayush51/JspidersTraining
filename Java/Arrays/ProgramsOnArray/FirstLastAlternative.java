package ProgramsOnArray;
import java.util.*;
public class FirstLastAlternative {
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,60,70};
		int [] res = new int[ar.length];
		//only works for even length of array
		for (int i = 0 , j = ar.length-1 , k = 0 ; k < res.length ; i++ , j-- , k++) {
			
			res[k] = ar[i];
			k++;

			if(k==res.length) {
				break ;
			}
			
			res[k] = ar[j];
		
//			res[k] = ar[i];
//			res[k+1] = ar[j];
		}
		
		System.out.println(Arrays.toString(res));
	}

}
