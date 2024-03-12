class WideningLong
{
	public static void main(String[]args)
	{
		long l = 874462214l ;
		System.out.println(l);
		//byte b = l ;			// error: incompatible types: possible lossy conversion from long to byte
		//System.out.println(b);
		//short s = l ;			// error: incompatible types: possible lossy conversion from long to short
		//System.out.println(s);
		//int i = l ;			// error: incompatible types: possible lossy conversion from long to int
		//System.out.println(i);
		//char c = l ;			// error: incompatible types: possible lossy conversion from long to char
		//System.out.println(c);
		float f = l ;
		System.out.println(f);
		double d = l ;
		System.out.println(d);
	}
}