import java.util.Scanner ;
class PatternTriangle4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Of n :");
		int n = sc.nextInt() ;
		for (int i = 0 ; i < n  ; i++ )
		{
			for (int j = n ; j > i ; j-- )
			{
				System.out.print("*"+" ");				
			}
			System.out.println();
		}
	}
}
