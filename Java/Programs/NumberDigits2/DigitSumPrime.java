import java.util.Scanner;
class DigitSumPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num = sc.nextInt();
		int sum = 0 ;
		for (int i = num; i!=0 ; i/=10 )
		{
			sum+=(i % 10);
		}
		System.out.println("Sum :"+sum);
		int den ;
		for (den=2 ; den<sum ; den++ )
		{
			if (sum%den == 0)
			{
				break;
			}
		}
		if (sum==den)
		{
			System.out.println("Sum Of Digits is Prime");
		}
		else
		{
			System.out.println("Sum Of Digits is Not Prime");
		}
	}
}
