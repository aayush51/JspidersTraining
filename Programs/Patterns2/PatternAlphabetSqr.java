import java.util.Scanner;
class PatternAlphabetSqr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of n : ");
		int n = sc.nextInt();
		char ch = 'A';
		for (int i=0 ; i<n ; i++)
		{
			for (int j=0 ; j<n ; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
