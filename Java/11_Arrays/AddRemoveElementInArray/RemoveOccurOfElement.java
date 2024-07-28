package AddRemoveElementInArray;
import java.util.*;
public class RemoveOccurOfElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to remove with there occurences :");
		int val = sc.nextInt();
		int [] a = {1,2,3,4,4,5,4,8,4,9};
		
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]==val)
			{
				count++;
			}
		}
		
		int [] b = new int[a.length - count];
		
		for(int i = 0, j = 0; i < a.length; i++ )
		{
			if(a[i] !=val)
			{
				b[j++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
		
		sc.close();
	}

}
