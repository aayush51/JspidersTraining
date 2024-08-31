package ProgramsOnArray2;
//import java.util.*;
public class FreqOfElements {
	
	public static void main(String[] args) {
		int[] a = {1,1,4,3,2,1,5,2,4,3,3,5,1};
		int[] count = new int[a.length];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			int ct = 0 ;
			for(int j=i+1 ; j < count.length ; j++) 
			{
				if(count[i]==-1)
				{
					break;
				}
				else if(a[i]==a[j]) {
					ct++;
					count[j]=-1;
				}
			}
			if(count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			if(count[i]!=-1)
			{
				System.out.println(a[i]+" repeated "+count[i]+" times");
			}
		}
		
	}

}
