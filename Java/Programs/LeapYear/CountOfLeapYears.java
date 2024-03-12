import java.util.Scanner;
class CountOfLeapYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Year : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Year : ");
		int end = sc.nextInt();
		int count = 0 ;
		if (start > 1582)
		{
			for (int year = start ; year<=end ; year++ )
			{
				if ( (year % 4 == 0  &&  year % 100 != 0) || year % 400 == 0 )
				{
					count++;
				}
			}
			System.out.println("There are " + count + " Leap Years in range of " + start + " to " + end);
		}
		else
		{
			System.out.println("Year should be Greater Than 1582 , first year of gregorean calender");
		}
		
	}
}
