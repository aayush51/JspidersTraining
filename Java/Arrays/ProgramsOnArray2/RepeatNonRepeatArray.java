package ProgramsOnArray2;
import java.util.*;
public class RepeatNonRepeatArray {

	public static void main(String[] args) {
		
		int[] a = { 1 , 2 , 5 , 1 , 3 , 5 , 4 , 5 , 2 , 6 };
		
		int[] ctArray = getCountArray(a);
		
		int[] repeatedElements = new int[getNumberOfRepeatedElements(ctArray)];
		
		int[] uniqueElements = new int[getNumberOfUniqueElements(ctArray)];
		
		for(int i = 0 , j = 0 , k = 0 ; i < ctArray.length ; i++)
		{
			if(ctArray[i]!=-1 && ctArray[i]>0)
			{
				repeatedElements[j] = a[i];
				j++;
			}
			else if(ctArray[i]==0)
			{
				uniqueElements[k] = a[i];
				k++;
			}
		}
		
		System.out.println("Repeated Elements = "+Arrays.toString(repeatedElements));
		System.out.println("Unique Elements   = "+Arrays.toString(uniqueElements));
				
	}
	
	public static int[] getCountArray(int[] array) {
		int[] count = new int[array.length];
		
		for (int i = 0; i < count.length ; i++)
		{
			int ct = 0;
			for (int j = i+1 ; j < count.length ; j++)
			{
				if(count[i]==-1)
				{
					break;
				}
				else if(array[i]==array[j])
				{
					count[j]=-1;
					ct++;
				}
			}
			if(count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		return count;		
	}
	
	public static int getNumberOfRepeatedElements(int[] count) {
		int repeated = 0;
		for(int i=0; i<count.length; i++) 
		{
			if(count[i]!=-1 && count[i]>0) {
				repeated++;
			}
		}
		return repeated;
	}
	public static int getNumberOfUniqueElements(int[] count) {
		int unique = 0;
		for(int i=0; i<count.length; i++) 
		{
			if(count[i]==0) {
				unique++;
			}
		}
		return unique;
	}
	
	
}
