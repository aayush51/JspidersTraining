class Factorial 
{
	public static void main(String[] args) 
	{
		int num = 5 ; 
		int product = 1 ;
		while (num>0)
		{
			product = product * num ;
			num--;
		}
		System.out.println("Factorial is " + product);
	}
}
