import java.util.Scanner;
class EvenLeapYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Year : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Year : ");
		int end = sc.nextInt();
		if (start > 1582)
		{
			for (int year = start ; year <= end ; year++ )
			{
				if ( (year%4 == 0 && year%100 != 0) || year%400 == 0 )
				{
					if (year%2 == 0)
					{
						System.out.println(year);
					}
					
				}
			}
			
		}
		else
		{
			System.out.println("Year Should be Greater Than 1582");
		}
	}
}
