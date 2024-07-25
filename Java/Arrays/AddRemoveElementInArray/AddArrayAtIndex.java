package AddRemoveElementInArray;
import java.util.*;
public class AddArrayAtIndex {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] b = {77,88,99};
		int [] c = new int[a.length+b.length];
		
		System.out.println("Enter Index Where To Insert Array: ");
		int index = s.nextInt();
		
		for(int i = 0 , j = 0 ; i < c.length; i++)
		{
			if(i<index) {
				c[i] = a[i];
			}
			else if(i>=index && j<b.length) {
				c[i] = b[j++];
			}
			else {
				c[i] = a[i-j];
			}
		}
		
		System.out.println(Arrays.toString(c));
		s.close();
	}

}
