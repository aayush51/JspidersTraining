package ProgramsOnArray;
import java.util.*;
public class RightRotateArray {
	
	public static int[] Rrotate(int[] array,int numOfRotations) 
	{	
		for(int j=0;j<numOfRotations;j++) 
		{
			int temp = array[array.length-1];
			for(int i = array.length-1 ; i > 0 ; i--) {
				array[i] = array[i-1];
			}
			array[0] =temp;		
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] a = {11,22,33,44,55,66,77};
		
		System.out.println(Arrays.toString(Rrotate(a,3)));
	}

}
