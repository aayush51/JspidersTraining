//Java Program to count the digits of a given number using while loop.
import java.util.Scanner;
class CountDigit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = sc.nextInt();
		int digits = 0;
		while(num>0)
		{
			//System.out.println("before:"+num);
			num=num/10;
			//System.out.println("after:"+num);
			digits++;
		}
		System.out.println("Count is :"+ digits);
	}
}
