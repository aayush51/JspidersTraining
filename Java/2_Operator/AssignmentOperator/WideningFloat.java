class WideningFloat
{
	public static void main(String[]args)
	{
		float f = 3.1415f ;
		System.out.println(f);
		/*byte b = f ;			// error: incompatible types: possible lossy conversion from float to byte
		System.out.println(b);
		short s = f ;			// error: incompatible types: possible lossy conversion from float to short
		System.out.println(s);
		int i = f ;				// error: incompatible types: possible lossy conversion from float to int
		System.out.println(i);
		long l = f ;			// error: incompatible types: possible lossy conversion from float to long
		System.out.println(l);
		char c = f ;			// error: incompatible types: possible lossy conversion from float to char
		System.out.println(c);*/
		double d = f ;
		System.out.println(d);
	}
}