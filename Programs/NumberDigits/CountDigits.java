import java.util.Scanner;
class CountDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		int count = 0 ;
		while (num > 0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}
