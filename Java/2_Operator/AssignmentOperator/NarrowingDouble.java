class NarrowingDouble 
{
    public static void main(String[] args) 
	{
        byte b = 25;
        double c1 = (double) b;
        System.out.println(c1);

        short s = 5566;
        double c2 = (double) s;
        System.out.println(c2);

        int i = 83331;
        double c3 = (double) i;
        System.out.println(c3);

        long l = 6646663l;
        double c4 = (double) l;
        System.out.println(c4);

        char c = 'h';
        double c5 = (double) c;
        System.out.println(c5);

        float f = 2441.439f;
        double c6 = (double) f;
        System.out.println(c6);

        double d = 532.52567;
        double c7 = (double) d;
        System.out.println(c7);
    }
}