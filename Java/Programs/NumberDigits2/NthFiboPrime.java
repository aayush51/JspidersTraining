import java.util.Scanner;
class NthFiboPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1=0 , n2=1 , n3 ;
		System.out.println("Enter Value Of N to find Nth Fibonacci Number : ");
		int	n = sc.nextInt();
		for (int i=0 ;i<n ;i++ )
		{
			n3 = n2+n1;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("The "+n+"th Fibonacci Number is : "+ n1);
		int den , num = n1 ;
		for (den=2 ; den<num ; den++ )
		{
			if (den%num==0)
			{
				break;
			}
		}
		if (num==den)
		{
			System.out.println("The Nth Fibo No. is Prime Number");
		}
		else
		{
			System.out.println("The Nth Fibo No. is not a Prime No.");
		}
	}
}
