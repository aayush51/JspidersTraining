package Sorting;
import java.util.*;
public class Merge3ArraysInSorted {
	
	public static void main(String[] args) {
		
		int[] a = {1,4,6,8,19,35,99};
		int[] b = {2,5,10,15,19,36};
		int[] c = {3,7,12,14,24,25,31,37};
		
		int[] d = new int[a.length+b.length+c.length];
		
		int i = 0 , j = 0 , k = 0 , x = 0 ;
		
		while(i<c.length) {
			if(a[i]<=b[j] && a[i]<=c[k]) {
				d[x++]=a[i++];
			}
			else if(b[j]<=a[i] && b[j]<=c[k]) {
				d[x++]=b[j++];
			}
			else if(c[k]<=a[i] && c[k]<=b[j]) {
				d[x++]=c[k++];
			}
			
			if(i==a.length || j==b.length || k==c.length) {
				break;
			}
		}

		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				d[x++] = a[i++];
			} else {
				d[x++] = b[j++];
			}
		}
		while (j < b.length && k < c.length) {
			if (b[j] <= c[k]) {
				d[x++] = b[j++];
			} else {
				d[x++] = c[k++];
			}
		}
		while (i < a.length && k < c.length) {
			if (a[i] <= c[k]) {
				d[x++] = a[i++];
			} else {
				d[x++] = c[k++];
			}
		}

		while (i < a.length) {
			d[x++] = a[i++];
		}
		while (j < b.length) {
			d[x++] = b[j++];
		}
		while (k < c.length) {
			d[x++] = c[k++];
		}

		System.out.println(Arrays.toString(d));
	}

}
