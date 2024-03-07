class LargestOfThree
{
	public static void main(String[]args)
	{
		int number1 = 7 ;
		int number2 = 5 ;
		int number3 = 2 ;
		int largest = number1>(number2>number3?number2:number3)?number1:(number2>number3?number2:number3);
		System.out.println("Largest Number is " + largest);
	}
}