class RangeOfPrime2 
{
	public static void main(String[] args) 
	{
		int start = 100 ;
		int end = 50 ;
		for (;start >= end ;start-- )
		{
			int den ;
			for (den = 2 ; den < start ; den++ )
			{
				if (start%den==0)
				{
					break;
				}
			}
			if (den == start)
			{
				System.out.println(start);
			}
		}
	}
}
