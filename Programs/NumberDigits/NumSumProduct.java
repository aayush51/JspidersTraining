import java.util.Scanner;
class NumSumProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();
		if ((num1+num2)==(num1*num2))
		{
			System.out.println("Sum and Product of Numbers are same");
			System.out.println("Sum : "+ (num1 + num2));
			System.out.println("Product : "+ (num1 * num2));
		}
		else
		{
			System.out.println("Sum and Product of Numbers are not same");			System.out.println("Sum : "+ (num1 + num2));
			System.out.println("Product : "+ (num1 * num2));
		}
	}
}
