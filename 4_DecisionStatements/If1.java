import java.util.Scanner;
class If1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a paid student ? :");
		boolean paidstud = sc.nextBoolean();
		if(paidstud==true)
		{
			System.out.println("Please Pay The Fees !! ");
		}
		System.out.println("Attend The Class");
	}
}