import java.util.Scanner;
class SumOfNaturalNums 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int sum = (n*(n-1))/2 ;
		//System.out.println("The Sum Of "+ n +" Natural Numbers are "+ sum); //45
		
		int sum = 0 ;
		for (int temp=1 ; temp<=n ; temp++)
		{
			sum += temp ;
		}
		System.out.println("The Sum Of "+ n +" Natural Numbers are "+ sum); //55
	}
}
