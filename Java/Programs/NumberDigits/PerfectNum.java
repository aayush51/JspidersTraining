import java.util.Scanner;
class PerfectNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt() ; 
		int sum = 0 ;
		int reverse = 0 ;
		for (int i = 1 ; i<=num ; i++ )
		{
			if (num%i==0)
			{
				sum = sum + i ;	
			}
		}
		System.out.println("Sum Of Factors is : " + sum);
		if (sum==num)
		{
			System.out.println("It is Perfect Number");
			for (int temp = num ; temp > 0 ; temp/=10 )
			{
				int last = temp % 10 ;
				reverse = reverse*10 + last ;
			}
			if (num == reverse)
			{
				System.out.println("It is a Palindrome");
			}
			else
			{
				System.out.println("It's not a Palindrome");
			}
		}
		else 
		{
			System.out.println("It is not a Perfect Number");
			int sum1 = 0 ;
			while (num>0)
			{
				sum1 = sum1 + (num%10) ;
				num/=10;
			}
			System.out.println("Sum of Digits is : " + sum1);
		}
	}
}
