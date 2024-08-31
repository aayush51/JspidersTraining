package AddRemoveElementInArray;
import java.util.*;
public class AddElementAtIndex {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int [] a = {1,2,3,4,5,6,7,8};
		
		int [] b = new int[a.length+1];
		
		System.out.println("Enter Index Where Element Should Be Added: ");
		int index = s.nextInt();
		System.out.println("Enter Element: ");
		int value = s.nextInt();
		if(index<a.length && index>=0)
		{
			for(int i = 0; i < b.length; i++)
			{
				if(i<index)
				{
					b[i] = a[i];
				}
				else if (i==index)
				{
					b[i] = value ;
				}
				else
				{
					b[i] = a[i-1];
				}
			}
			
		}
		
		System.out.println(Arrays.toString(b));		
		s.close();
	}

}
