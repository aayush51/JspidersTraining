import java.util.Scanner;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");                 
		int num = sc.nextInt();
		int prod = 1 ;
		for (int i = 0; i < num/2 ; i++ )
		{
			prod = i * (i+1) ;
			if (prod == num)
			{
				break;
			}
		}
		if (prod == num)
		{
			System.out.println("It is a Pronic Number");
		}
		else
		{
			System.out.println("Its not a Pronic Number");
		}		
	}
}
