import java.util.Scanner;
class TwistedPrimeNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int den = 2;
		while (den<num)
		{
			if (num % den == 0)
			{
				break;
			}
			den++;
		}
		if (num == den)
		{
			int reverse = 0;
			for (int i=num; i!=0 ; i/=10 )
			{
				int last = i % 10;
				reverse = reverse * 10 + last;
			}
			while (den<reverse)
			{
				if (reverse % den == 0)
				{
					break;
				}
				den++;
			}
			if (reverse == den)
			{
				System.out.println("It is a Twisted Prime Number");	
			}
			else
			{
				System.out.println("It is not a Twisted Prime Number");
			}	
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}
	}
}
