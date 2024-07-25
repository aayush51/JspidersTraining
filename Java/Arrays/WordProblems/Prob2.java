package WordProblems;


/*

Once upon a numerical journey, in the kingdom of positive integers, there were remarkable figures known as "leaders". 
These leaders were no ordinary digits, they possessed a special quality. Each leader stood proudly, towering over all 
their companions to the right, show casing their supremacy. 

It was a simple rule:

A leader has to be greater than or equal to everyone to its right, even the last digit, standing at the kingdoms edge, 
played its part as a loyal follower. But at last, if no leader emerged to claim the throne, the story sadly concluded with 
a numerical -1, signaling the absence of these exceptional characters in the arrays tale.

Example1:
input: 10 4 3 6 8 1 2
output: 10 8 2

 */


public class Prob2 {

	public static void main(String[] args) {

		int [] a = {10 ,4 ,3 ,6 ,8 ,1 ,2};
		int num = a[a.length-1];
		System.out.println(num);
		for(int i = a.length-2; i >= 0; i--)
		{						
			if(a[i]>=num)
			{
				System.out.println(a[i]);
				num=a[i];
			}
		}
	}
}
