class NarrowingInt 
{
    public static void main(String[] args) 
	{
        byte b = 58;
        int i1 = (int) b;
        System.out.println(i1);

        short s = 13868;
        int i2 = (int) s;
        System.out.println(i2);

        int i = 2576799;
        int i3 = (int) i;
        System.out.println(i3);

        long l = 67899112l;
        int i4 = (int) l;
        System.out.println(i4);

        char c = 'k';
        int i5 = (int) c;
        System.out.println(i5);

        float f = 333.44f;
        int i6 = (int) f;
        System.out.println(i6);

        double d = 8975.26;
        int i7 = (int) d;
        System.out.println(i7);
    }
}