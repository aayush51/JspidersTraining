import java.util.Scanner;
class SumFactDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0 ;
		for (int i = num; i!=0 ; i/=10 )
		{
			int last = i % 10 ;
			int fact =1 ;
			for (int j = last; j > 0 ; j-- )
			{
				fact*=j;
			} 
			sum+=fact;
		}
		System.out.println("Sum Of Factorial Of Digits of "+ num +" is : " + sum);
	}
}
