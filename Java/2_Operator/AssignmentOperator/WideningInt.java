class WideningInt
{
	public static void main(String[]args)
	{
		int i = 647 ;
		System.out.println(i);
		//short s = i ;				// error: incompatible types: possible lossy conversion from int to short
		//System.out.println(s);
		//byte b = i ;				//error: incompatible types: possible lossy conversion from int to byte
		//System.out.println(b);
		long l = i ;
		System.out.println(l);
		//char c = i ;				// error: incompatible types: possible lossy conversion from int to char
		//System.out.println(c);
		float f = i ;
		System.out.println(f);
		double d = i ;
		System.out.println(d);
	}
}