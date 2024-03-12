class SumOfNum
{
	public static void main(String[]args)
	{
		int startnum = 1 ;
		int endnum = 10 ;
		int sum = 0;
		while(startnum<=endnum)
		{
			sum = sum + startnum;
			startnum++;
		}
		System.out.println(sum);
	}
}