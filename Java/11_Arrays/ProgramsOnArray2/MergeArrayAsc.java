package ProgramsOnArray2;
import java.util.*;
public class MergeArrayAsc {
	public static void main(String[] args) {
		// Arrays Should be in the Ascending order order 
		int [] a1 = {1,2,33,40,50,100,234};
		int [] a2 = {12,56,78,90,102};
		int [] ans = new int[a1.length+a2.length];
		int i = 0 , j = 0 , k = 0 ;
		while(i<ans.length) {
			if(a1[i]<a2[j]) {
				ans[k]=a1[i];
				i++;
				k++;
			}
			else if(a1[i]>a2[j]) {
				ans[k]=a2[j];
				j++;	
				k++;
			}
			if(i==a1.length || j==a2.length) {
				break;
			}
		}
		if(i<a1.length) {
			for(int k2=i;k2<a1.length;k2++) {
				ans[k]=a1[k2];
				k++;
			}
		}
		else if(j<a2.length) {
			ans[k]=a2[j];
			k++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
