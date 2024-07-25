package WordProblems;

import java.util.Arrays;

/*
In this scenario, you are presented with a collection of numbers(array) that should contain all the numbers from 1 to a specific value(n). 
However due to an issue or a mistake, one number was accidentally duplicated, causing another number to vanish!
Your mission, detective, is to:
1) Identify the sneaky duplicate who snuck into the group, masquerading as another number.
2) Uncover the missing figure, the innocent number who was unfairly removed.
To assist you in this mission, you are provided with a special tool a function or a method that takes in the suspicious array of numbers. 
This detective tool will analyze the evidence and return a secret message containing both the duplicate and the missing number.

Input Format:

Example1:
Input: 1 2 2 4
Output: 2 3

Example2:
Input: 3 1 2 5 2

Output: 2 4
*/

public class Prob1 {
	
	public static void main(String[] args) {
		
		int [] a = {1,6,4,3,3,2};
		System.out.println(Arrays.toString(getDuplicateMissing(a)));
		
	}
	
	public static int[] getDuplicateMissing(int [] array) {
		
		int duplicate = 0;
		int missing = 0;
		int sum=0;
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		missing = ((max*(max+1))/2) - sum;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length ; j++) {
				if(array[i]==array[j]) {
					duplicate = array[j];
					missing += duplicate;
				}
			}
		}
		
		
		int[] newArray = new int[2];
		newArray[0] = duplicate;
		newArray[1] = missing;
		
		return newArray;
		
	}

}
