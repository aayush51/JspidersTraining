import java.util.Scanner;
class If2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Zomato !");
		System.out.println("Check for Which Offer Your Are Eligible");
		System.out.println("Are You New User at Zomato ? ");
		boolean newuser = sc.nextBoolean();
		if(newuser)
		{
			System.out.println("You Got 50% Discount On Your Order");
		}
		System.out.println("You Got Free Delivery");
	}
}