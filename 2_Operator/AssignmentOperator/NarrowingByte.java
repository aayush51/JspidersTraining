class NarrowingByte 
{
    public static void main(String[] args) 
    {
        byte b = 125 ;
        byte b1 = (byte) b ;
        System.out.println(b1); 

        short s = 5469 ;
        byte b2 = (byte) s ;
        System.out.println(b2);

        int i = 864952 ;
        byte b3 = (byte) i ;
        System.out.println(b3);

        long l = 88964855l ;
        byte b4 = (byte) l ;
        System.out.println(b4);

        char c = 'z' ;
        byte b5 = (byte) c ;
        System.out.println(b5);  

        float f = 96.25f ;
        byte b6 = (byte) f ;
        System.out.println(b6);

        double d = 986.2549 ;
        byte b7 = (byte) d ;
        System.out.println(b7);

    }
}