import java.util.Scanner;
class Switch2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		switch (num)
		{
			case 1 :
			{
				System.out.println("From 1");
				break;
			}
			
			case 2 :
			{
				System.out.println("From 2");
				break;
			}
			
			
			case 3 :
			{
				System.out.println("From 3");
				break;
			}
			
			
			default :
			{
				System.out.println("From default");
			}
		
		}
	}
}
