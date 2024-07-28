package Sorting;
import java.util.*;
public class Merge2ArraysInSorted {
	
	public static void main(String[] args) {
		
		// Arrays should be sorted
		
		int [] a = {10, 23, 34, 49, 51, 64, 72, 89};
		
		int [] b = {11, 22, 54, 69, 87};
		
		int [] c = new int[a.length+b.length];
		
		int i = 0 , j = 0 , k = 0 ;
		while(i<c.length) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else if(a[i]>b[j]) {
				c[k++]=b[j++];
			}
			
			if(i==a.length || j==b.length) {
				break;
			}
		}
		if(i<a.length) {
			while(i<a.length) {
				c[k++]=a[i++];
			}
		}
		else if (j<b.length) {
			while(i<b.length) {
				c[k++]=b[j++];
			}
		}
		
		System.out.println(Arrays.toString(c));
	}

}
