class ReverseNum 
{
	public static void main(String[] args) 
	{
		int num = 12345 ;
		int reverse = 0 ;
		while (num>0)
		{
			int last = num % 10 ;
			reverse = reverse*10 + last ;
			num/=10;
		}
		System.out.println(reverse);
	}
}
