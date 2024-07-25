package Sorting;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		int [] ar = {5,3,77,43,345,99,123,44,2};
		for (int pass = 0; pass < ar.length; pass++) {
			for (int comp = 0; comp < ar.length-1-pass; comp++) {
				if(ar[comp] > ar[comp+1]) {
					int temp = ar[comp];
					ar[comp] = ar[comp+1];
					ar[comp+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
