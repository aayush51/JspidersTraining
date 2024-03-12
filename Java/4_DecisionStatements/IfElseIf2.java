import java.util.Scanner;
class IfElseIf2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Marks :");
		
		double marks = s.nextDouble();
		
		if(marks>=0 && marks<35)
		{
			System.out.println("Fails!");
		}
		else if (marks==35)
		{
			System.out.println("Passed!");
		}
		else if (marks>35 && marks<=60)
		{
			System.out.println("Second Class");
		}
		else if (marks>60 && marks<=75)
		{
			System.out.println("First Class!");
		}
		else if (marks>75  && marks<=90)
		{
			System.out.println("First Class with Distinction !!");
		}
		else if (marks>90 && marks<=100)
		{
			System.out.println("Distinction !!!");
		}
		
	}
}
