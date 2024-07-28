package AddRemoveElementInArray;
import java.util.*;
public class RemovePartOfArray {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = {11,22,33,44,55,66,77,88};
		
		System.out.println("Enter Start Index Of Elements Which To Remove : ");
		int start = s.nextInt();
		System.out.println("Enter End Index Of Elements Which To Remove : ");
		int end = s.nextInt();
		int diff = end - start;
		int [] b = new int[a.length-diff];
		
		if(start>=0 && end<a.length)
		{
			for(int i = 0; i < a.length; i++)
			{
				if(i<start)
				{
					b[i] = a[i];
				}
				else if(i>=end)
				{
					b[i-diff]=a[i];
				}
			}
		}
		else
		{
			System.out.println("Invalid index - INDEX NOT FOUND !");
		}
		System.out.println(Arrays.toString(b));

		s.close();
	}
}
