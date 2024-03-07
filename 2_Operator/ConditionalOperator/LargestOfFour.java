class LargestOfFour
{
	public static void main(String[]args)
	{
		int number1 = 97 ;
		int number2 = 98 ;
		int number3 = 99 ;
		int number4 = 96 ;
		int largest = number1>(number2>(number3>number4?number3:number4)?number2:(number3>number4?number3:number4))?		number1:(number2>(number3>number4?number3:number4)?number2:(number3>number4?number3:number4));
		System.out.println("Largest Number is " + largest);
	}
}