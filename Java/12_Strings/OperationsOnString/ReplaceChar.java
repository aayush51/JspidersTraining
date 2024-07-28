package OperationsOnString;

public class ReplaceChar {
	
	public static String replace(String ip , char old , char replacement)
	{
		String ans="";
		for (int i = 0; i < ip.length(); i++)
		{
			char ch = ip.charAt(i);
			if(ch ==old)
			{
				ans+=replacement;
			}
			else {
				ans+=ch;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String str1 = "banana";
		System.out.println(replace(str1, 'a', '@'));
	}

}
