class PrimeNum 
{
	public static void main(String[] args) 
	{
		int num = 29 ;
		int den = 2 ;
		while (den < num)
		{
			if (num%den == 0)
			{
				break;
			}
			den++;
		}
		if (num == den)
		{
			System.out.println("It is Prime Number");
		}
		else
		{
			System.out.println("It is Not a Prime Number");
		}
	}
}
