package AddRemoveElementInArray;

import java.util.*;

public class RemoveEvenElements {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = {11,22,33,44,55,66,77,88};
		int count=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]%2==0)
			{
				count++;
			}
		}
		int [] b = new int[a.length-count];

		for(int i = 0,j=0; i < a.length; i++)
		{
			if(a[i]%2!=0)
			{

				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		s.close();
	}
}
