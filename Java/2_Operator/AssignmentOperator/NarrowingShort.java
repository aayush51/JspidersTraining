class NarrowingShort 
{
    public static void main(String[] args) 
	{
        byte b = 108;
        short s1 = (short) b;
        System.out.println(s1);

        short s = 6583;
        short s2 = (short) s;
        System.out.println(s2);

        int i = 698585;
        short s3 = (short) i;
        System.out.println(s3);

        long l = 394528885l;
        short s4 = (short) l;
        System.out.println(s4);

        char c = 'm';
        short s5 = (short) c;
        System.out.println(s5);

        float f = 654.77f;
        short s6 = (short) f;
        System.out.println(s6);

        double d = 875.3545;
        short s7 = (short) d;
        System.out.println(s7);
    }
}