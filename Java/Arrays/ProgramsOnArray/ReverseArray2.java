package ProgramsOnArray;
import java.util.*;
public class ReverseArray2 {
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,60,70};
		int [] ar1 = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			ar1[ar.length - 1 - i] = ar[i];
		}
		
		System.out.println(Arrays.toString(ar1));
	}
}