package ProgramsOnArray2;
import java.util.*;
public class Reverse2DArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] [] ar = {
				{1,2,3,4},
				{4,5,6,7,8},
				{7,8,9,10}
		};
		
		for (int i = 0; i < ar.length;i++) {
			int[] temp = ar[i];
			for (int j = 0 , k = temp.length-1 ; j < k ; j++,k--) {
				int v = temp[j];
				temp[j] = temp[k];
				temp[k] = v;
			}
			ar[i] = temp;
		}
		
		System.out.println(Arrays.toString(ar[0]));
		System.out.println(Arrays.toString(ar[1]));
		System.out.println(Arrays.toString(ar[2]));
		
		s.close();
	}
}
