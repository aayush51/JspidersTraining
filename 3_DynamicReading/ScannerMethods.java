import java.util.Scanner;
class ScannerMethods
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Byte Number :");
		byte b = sc.nextByte();
		System.out.println("Enter a Short Number :");
		short s = sc.nextShort();
		System.out.println("Enter a Int Number :");
		int i = sc.nextInt();
		System.out.println("Enter a Long Number :");
		long l = sc.nextLong();
		System.out.println("Enter a Float i.e Decimal Point Number :");
		float f = sc.nextFloat();
		System.out.println("Enter a character :");
		char c = sc.next().charAt(0);
		System.out.println("Enter a Double i.e Decimal Point Number :");
		double d = sc.nextDouble();
		System.out.println("Enter a Boolean Value Either true or false :");
		boolean bvalue = sc.nextBoolean();
		
		System.out.println();
		
		System.out.println("Byte Number is :   "  + b );
		System.out.println("Short Number is :  "  + s );
		System.out.println("Int Number is :    "  + i );
		System.out.println("Long Number is :   "  + l );
		System.out.println("Float Number is :  "  + f );
		System.out.println("Character is :     "  + c );
		System.out.println("Double Number is : "  + d );
		System.out.println("Boolean Value is : "  + bvalue );		
	}
}