class WideningShort
{
	public static void main(String[]args)
	{
		short s = 313 ;
		System.out.println(s);
		//byte b = s ;				// incompatible types: possible lossy conversion from short to byte
		//System.out.println(b);
		int i = s ;
		System.out.println(i);
		long l = s ;
		System.out.println(l);
		//char c = s ;				//  incompatible types: possible lossy conversion from short to char
		//System.out.println(c);
		float f = s ;
		System.out.println(f);
		double d = s ;
		System.out.println(d);
	}
}