class DigitSumProduct 
{
	public static void main(String[] args) 
	{
		int num = 123 ;
		int sum = 0 ;
		int product = 1 ;
		while (num != 0)
		{
			int temp = num % 10 ;
			sum += temp ;
			product *= temp ;
			num/=10 ;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+product);
	}
}
