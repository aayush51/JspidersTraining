import java.util.Scanner;
class IfElse2
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Amount to Transfer :");
		double amount = s.nextDouble();
		double limit = 20000.00 ; 
		if(amount<=limit)
		{
			System.out.println("Money can be Transferred");
		}
		else
		{
			System.out.println("Money cann't be Transferred");
		}
	}
}