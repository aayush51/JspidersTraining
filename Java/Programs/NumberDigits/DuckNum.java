class DuckNum
{
	public static void main(String[] args) 
	{
		int num = 103;
		while (num>0)
		{
			int last = num % 10 ;
			if (last == 0 )
			{
				break;
			}
			num/=10;
		}
		if (num==0)
		{
			System.out.println("It is not a Duck Number");
		}
		else
		{
			System.out.println("It is a Duck Number");
		}
	}
}
