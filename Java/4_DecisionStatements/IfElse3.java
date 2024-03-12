import java.util.Scanner;
class IfElse3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character :");
		char ch = s.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("It is an Alphabet");
		}
		else
		{
			System.out.println("It is Not an Alphabet");
		}
	}
}
