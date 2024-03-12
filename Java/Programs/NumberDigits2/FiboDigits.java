import java.util.Scanner;
class FiboDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		for (int i=num ; num!=0 ; num/=10 )
		{
			int last = num%10 ;
			if (last!=0 && last!=1 && last!=2 && last!=3 && last!=5 && last!=8)
			{
				break;
			}
		}
		if (num==0)
		{
			System.out.println("Number has all Fibo Digits");
		}
		else
		{
			System.out.println("Number doesn't have all Fibo Digits");
		}
	}
}
