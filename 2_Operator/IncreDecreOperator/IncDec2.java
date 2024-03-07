class IncDec2
{
	public static void main(String[]args)
	{
		int p = -2 , q = 8 , r = p + q , s ;
		//r++ + p++		//compile time error
		s = r++ + p++ ;
		++q;
		s = q-- ;
		r = p + q++ + -s-- ;
		q = q++ ;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
	}
}