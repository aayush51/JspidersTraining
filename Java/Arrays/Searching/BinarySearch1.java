package Searching;
import java.util.*;
public class BinarySearch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {2,4,5,56,5676,2345,567};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println("Enter Element to Search :");
		int search = sc.nextInt();
		int start = 0 , end = ar.length-1;
		int mid = start+end/2;
		while(start<=mid) {
			if(ar[mid]==search) {
				System.out.println("Element Found at " + mid);
				break;
			}
			else if(search>ar[mid]) {
				start = mid+1;
			}
			else {
				end=mid-1;
			}
			mid = (start+end)/2;
		}
		sc.close();
	}

}
