class Decrement
{
	public static void main(String[]args)
	{
		int pocket=100;
		System.out.println(--pocket);
		System.out.println(--pocket);
		System.out.println(pocket--);
		System.out.println(pocket);
		System.out.println(pocket--);
		System.out.println(--pocket + pocket--);
		System.out.println(pocket);
		System.out.println(pocket-- + --pocket);
		System.out.println(pocket);
	}
}