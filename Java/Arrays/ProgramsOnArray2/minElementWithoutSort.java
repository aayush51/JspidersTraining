package ProgramsOnArray2;

public class minElementWithoutSort {
	public static void main(String[] args) {
		int[] a = {61, 52, 23, 94, 25, 66};
		int min = Integer.MAX_VALUE;
//		System.out.println(max);
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
