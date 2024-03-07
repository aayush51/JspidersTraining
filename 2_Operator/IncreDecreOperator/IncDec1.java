class IncDec1
{
	public static void main(String[]args)
	{
		int a = 5 , b = 10 , c = 26 , d ;
		d = a + ++b + --c ;
		a = d++ * 10 - ++b ;
		b = a - b++ ;
		c = -b + ++c ;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}