import java.util.Scanner;
class LeapYear1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year = sc.nextInt();
		if (year<1582)
		{
			System.out.println("Year must be Greater than 1582 , first year of Gregorean Calender was employed");
		}
		else if ((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println(year + " is a Leap Year");
		}
		else 
		{
			System.out.println(year + " is not a Leap Year");
		}
	}
}