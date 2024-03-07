import java.util.Scanner;
class SumOfFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() ; 
		int sum = 0 ;
		for (int i = 1 ; i<=num ; i++ )
		{
			if (num%i==0)
			{
				sum = sum + i ;	
			}
		}
		System.out.println(sum);
		if (sum==num)
		{
			System.out.println("It is Perfect Number");
		}
		else 
		{
			System.out.println("It is not a Perfect Number");
		}
	}
}
