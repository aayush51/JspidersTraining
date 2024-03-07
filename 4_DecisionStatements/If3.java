import java.util.Scanner;
class If3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you late at the class ?");
		boolean latestud = sc.nextBoolean();
		if(latestud)
		{
			System.out.println("Wait For 10 minutes");
		}
		System.out.println("Attend the Class");
		
	}
}