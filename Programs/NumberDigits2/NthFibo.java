import java.util.Scanner;
class NthFibo 
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
	}
}
