import java.util.Scanner;
class RangeOfLeapYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Year : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Year : ");
		int end = sc.nextInt();
		if (start < 1582)
		{
			System.out.println("Year should be Greater than 1582 , First Year of Gregorean Calender was employed");
		}
		else
		{
			for (int year = start ; year <= end ; year++ )
			{
				if( ( year % 4 == 0  &&  year % 100 != 0 ) || year % 400 == 0 )
				{
					System.out.println(year);
				}
			}
		}
	}
}
