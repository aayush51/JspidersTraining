import java.util.Scanner;
class UserData
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello");
		System.out.println("Enter Your First Name :");
		String fname = sc.next();
		System.out.println("Enter Your Last Name :");
		String lname = sc.next();
		System.out.println("Enter Your Age :");
		byte age = sc.nextByte();
		System.out.println("Enter Your Birth Year :");
		short yearOfBirth = sc.nextShort();
		System.out.println("Enter Your Phone Number :");
		long phone = sc.nextLong();
		System.out.println("Enter Your SSC/10th Result in Percentage :");
		float result = sc.nextFloat();
		System.out.println("Enter Your/Family Yearly Income :");
		double income = sc.nextDouble();
		System.out.println("Enter Your Gender :");
		char gender = sc.next().charAt(0);
		System.out.println("Are Your Student (Enter true or false):");
		boolean student = sc.nextBoolean();
		
		System.out.println();
		
		System.out.println("User Data");
		System.out.println("Full Name : " + fname + " " + lname);
		System.out.println("Age : " + age);
		System.out.println("Birth Year : " + yearOfBirth);
		System.out.println("Phone Number : " + phone);
		System.out.println("SSC/10th Result(in %) : " + result);
		System.out.println("Your/Family Yearly Income : " + income);
		System.out.println("Gender : " + gender);
		System.out.println("Is Student? : " + student);
		
	}
}