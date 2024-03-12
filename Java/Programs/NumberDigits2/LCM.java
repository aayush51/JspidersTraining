import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		//LCM of Two Numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 :");
		int n1 = sc.nextInt() ;
		System.out.println("Enter Num2 :");
		int n2 = sc.nextInt() ;
		int big = n1 > n2 ? n1 : n2 ;
		while (true)
		{
			if (big%n1 == 0 && big%n2 == 0)
			{
				System.out.println("LCM of " + n1 + " and " + n2 + " is : " + big);
				break;
			}
			big++;
		}
	}
}
