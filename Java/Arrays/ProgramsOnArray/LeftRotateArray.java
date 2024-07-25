package ProgramsOnArray;
import java.util.*;
public class LeftRotateArray {
	
	public static int[] Lrotate(int[] array,int numOfRotations) 
	{	
		for(int j=0;j<numOfRotations;j++) 
		{
			int temp = array[0];
			for(int i = 0; i < array.length-1; i++) {
				array[i] = array[i+1];
			}
			array[array.length-1] =temp;			
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] a = {11,22,33,44,55,66,77};
		
		System.out.println(Arrays.toString(Lrotate(a,3)));
	}

}
