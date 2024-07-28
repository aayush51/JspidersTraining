package DeclareInit;

public class Arr1 {
	public static void main(String[] args) {
		int[] arr1 = new int[5]; // Assigned with default values if not initialized
		int[] arr2 = { 1, 2, 3, 4, 5 }; 
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 }; 
		int[] arr4 = new int[5]; 
		
		arr4[0] = 1;
		arr4[1] = 2;
		arr4[2] = 3;
		arr4[3] = 4;
		arr4[4] = 5;

		System.out.println("arr1: ");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		//System.out.println(arr1[5]); // ArrayIndexOutOfBoundsException
		System.out.println();

		System.out.println("arr2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		System.out.println("arr3: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

		System.out.println("arr4: ");
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
	}
}
