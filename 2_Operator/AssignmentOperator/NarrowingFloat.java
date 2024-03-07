class NarrowingFloat 
{
    public static void main(String[] args) 
	{
        byte b = 76;
        float c1 = (float) b;
        System.out.println(c1);

        short s = 5477;
        float c2 = (float) s;
        System.out.println(c2);

        int i = 63377;
        float c3 = (float) i;
        System.out.println(c3);

        long l = 58844l;
        float c4 = (float) l;
        System.out.println(c4);

        char c = 'o';
        float c5 = (float) c;
        System.out.println(c5);

        float f = 997.8f;
        float c6 = (float) f;
        System.out.println(c6);

        double d = 749378.7448;
        float c7 = (float) d;
        System.out.println(c7);

    }
}