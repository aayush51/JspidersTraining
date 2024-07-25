package ProgramsOnArray;
import java.util.*;
public class LRrotateArray3 {
	
	public static void main(String[] args) {
		
		int[] a = {11,22,33,44,55,66,77,88,99};
		
		int temp1 = a[0];
		for (int i = 0  ; i < a.length/2; i++) {
			a[i] = a[i+1];
		}
		a[(a.length/2)-1] = temp1;
		
		
		int temp2 = a[a.length-1];
		for ( int i = a.length-1; i > a.length/2 ; i-- ) {
			a[i] = a[i-1];
		}
		a[(a.length/2)+1] = temp2;

        

		System.out.println(Arrays.toString(a));
		
	}

}
