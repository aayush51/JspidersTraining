class RangeOfPrime 
{
	public static void main(String[] args) 
	{
		int start = 10 ;
		int end = 50 ;
		while (start <= end)
		{
			int den = 2 ;
			while (den < start)
			{
				if (start%den==0)
				{
					break;
				}
				den++;
			}
			if (den == start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
