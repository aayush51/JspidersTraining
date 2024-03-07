class WideningChar
{
	public static void main(String[]args)
	{
		char c = 'Q' ;
		System.out.println(c);
		//byte b = c ;			// error: incompatible types: possible lossy conversion from char to byte
		//System.out.println(b);
		//short s = c ;			// error: incompatible types: possible lossy conversion from char to short
		//System.out.println(s);
		int i = c ;
		System.out.println(i);
		long l = c ;
		System.out.println(l);
		float f = c ;
		System.out.println(f);
		double d = c ;
		System.out.println(d);
	}
}