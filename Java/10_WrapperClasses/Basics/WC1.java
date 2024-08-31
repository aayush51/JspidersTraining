package Basics;

public class WC1 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
//		The constructor Byte(byte) has been deprecated since version 9 and marked for removal
		
		//Byte b = new Byte(120);	//The constructor Byte(int) is undefined
		Byte b1 = new Byte((byte) 127);
		System.out.println(b1);
		Byte b2 = new Byte((byte) 128); // edge of range
		System.out.println(b2);
		Byte b3 = new Byte((byte) 129);
		System.out.println(b3);
		Byte b4 = new Byte((byte) 293);
		System.out.println(b4);
		
		//Short s1 = new Short(985);	//The constructor Short(int) is undefined
		Short s1 = new Short((short) 9852);
		System.out.println(s1);
		Short s2 = new Short((short) 32767); // edge of range 2^15 - 1
		System.out.println(s2);
		Short s3 = new Short((short) 32768);
		System.out.println(s3);
		Short s4 = new Short((short) 32769);
		System.out.println(s4);
		
		Character c1 = new Character((char) 78);
		System.out.println(c1);
		Character c2 = new Character((char) 78.9);
		System.out.println(c2);
		Character c3 = new Character((char)9999);
		System.out.println(c3);
		Character c4 = new Character('m');
		System.out.println(c4);
		
		Integer i1 = new Integer(4924);
		System.out.println(i1);
		Integer i2 = new Integer(2099999999);
		System.out.println(i2);
		Integer i3 = new Integer(2147483647);  // 2^31 - 1
		System.out.println(i3);
		Integer i4 = new Integer(-2147483648);  // -2^31
		System.out.println(i4);
		//Integer i5 = new Integer(-2147483649);	//The literal 2147483649 of type int is out of range
		
		Long l1 = new Long(-9223372036854775808l); // -2^63
		System.out.println(l1);
		Long l2 = new Long(9223372036854775807l);  // 2^63 - 1
		System.out.println(l2);
		Long l3 = new Long(2147483647);
		System.out.println(l3);
		Long l4 = new Long(-2147483648);
		System.out.println(l4);
		
		
		
	}

}
