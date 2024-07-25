package AddRemoveElementInArray;

import java.util.Arrays;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,1,3,4,3,5,1,3};
		int[] count = new int[a.length];
		
		for(int i=0 ; i<a.length ; i++)
		{
			int ct=0;
			for(int j=i+1 ; j<a.length ; j++)
			{
				if(count[i]==-1)
		     		{
					break;
				}
				else if(a[i]==a[j])
				{
					ct++;
					count[j]=-1;
				}
			}
			if(count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		
		System.out.println("Array A = "+Arrays.toString(a));

		System.out.println("Count = "+Arrays.toString(count));
		
		int duplicates=0;
		for(int i=0 ; i<a.length ; i++)
		{      
			if(count[i]==-1 || count[i]!=0)
			{
				duplicates++;
			}
		}
		System.out.println(duplicates);
		
		int[] b = new int[a.length-duplicates];
		
		for(int i=0 ,j=0 ; i<count.length;)
		{
			if(count[i]==-1 || count[i]!=0)
			{
				i++;
			}
			else
			{
				
				b[j]=a[i];
				j++;
				i++;
			}
		}
		System.out.println("Not Repeated = "+Arrays.toString(b));
	}

}
