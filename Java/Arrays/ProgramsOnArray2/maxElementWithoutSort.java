package ProgramsOnArray2;

public class maxElementWithoutSort {
	public static void main(String[] args) {
		int[] a = {61, 52, 23, 94, 25, 66};
		int max = Integer.MIN_VALUE;
//		System.out.println(max);
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
