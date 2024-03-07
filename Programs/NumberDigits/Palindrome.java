class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 12321 ;
		int reverse = 0 ;
		for (int temp = num ; temp > 0 ; temp/=10 )
		{
			int last = temp % 10 ;
			reverse = reverse*10 + last ;
		}
		if (num == reverse)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It's not a Palindrome");
		}
	}
}
