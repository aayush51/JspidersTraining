import java.util.Scanner;
class IfElseIf3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character :");
		char ch = s.next().charAt(0);
		if (ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
		{
			if (ch>='a' && ch<='z')
			{
				System.out.println("It is Lowercase Alphabet");
			}
			else 
			{
				System.out.println("It is Uppercase Alphabet");
			}
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("It is Digit");
		}
		else
		{
			System.out.println("It is Special Character");
		}
	}
}
