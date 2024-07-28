package AddRemoveElementInArray;
import java.util.*;
public class RemoveElementFromArray {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = {11,22,33,44,55,66,77,88};
		int [] b = new int[a.length-1];
		System.out.println("Enter Index Of Element Which To Remove : ");
		int index = s.nextInt();
		if(index<a.length && index>=0)
		{
			for(int i = 0; i < a.length; i++)
			{
				if(i<index)
				{
					b[i] = a[i];
				}
				else if(i>index)
				{
					b[i-1]=a[i];
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
