class NarrowingLong 
{
    public static void main(String[] args) 
	{
        byte b = 89;
        long l1 = (long) b;
        System.out.println(l1);

        short s = 4567;
        long l2 = (long) s;
        System.out.println(l2);

        int i = 765885;
        long l3 = (long) i;
        System.out.println(l3);

        long l = 789953l;
        long l4 = (long) l;
        System.out.println(l4);

        char c = 'v';
        long l5 = (long) c;
        System.out.println(l5);

        float f = 234.17f;
        long l6 = (long) f;
        System.out.println(l6);

        double d = 7865.16;
        long l7 = (long) d;
        System.out.println(l7);

    }
}