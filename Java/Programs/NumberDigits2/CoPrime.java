import java.util.Scanner;
class CoPrime 
{
	public static void main(String[] args) 
	{
		//HCF of Two Numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 :");
		int n1 = sc.nextInt() ;
		System.out.println("Enter Num2 :");
		int n2 = sc.nextInt() ;
		int small = n1 < n2 ? n1 : n2 ;
		while (true)
		{
			if (n1%small == 0 && n2%small == 0)
			{
				System.out.println("HCF of " + n1 + " and " + n2 + " is : " + small);
				break;
			}
			small--;
		}
		if (small==1)
		{
			System.out.println("These are Co Prime Numbers");
		}
		else
		{
			System.out.println("These are not Co Prime Numbers");
		}
	}
}
