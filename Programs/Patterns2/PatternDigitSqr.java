import java.util.Scanner;
class PatternDigitSqr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of n : ");
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++)
		{
			for (int j=0 ; j<n ; j++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
	}
}
