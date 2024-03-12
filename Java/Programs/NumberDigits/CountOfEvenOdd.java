class CountOfEvenOdd 
{
	public static void main(String[] args) 
	{
		int num = 123456789 ;
		int evencount = 0 ;
		int oddcount = 0 ;
		System.out.println(num);
		while (num>0)
		{
			int last = num%10 ;
			if (last%2==0)
			{
				System.out.println(" Even: " + last);
				evencount++;
			}
			else
			{
				System.out.println(" Odd: " + last);
				oddcount++;
			}
			num/=10 ;
		}
		
		System.out.println("There are "+ evencount + " even digits and " + oddcount + " odd digits ");
	}
}
