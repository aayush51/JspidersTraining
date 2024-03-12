import java.util.Scanner;
class PrimeDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		for (; num!=0 ; num/=10 )
		{
			int last = num%10 ; 
			if (last!=2 && last!=3 && last!=5 && last!=7)
			{
				break;
			}
		}
		if (num==0)
		{
			System.out.println("Number have all Prime Digits");
		}
		else
		{
			System.out.println("Number doesn't have all Prime Digits");
		}
	}
}
