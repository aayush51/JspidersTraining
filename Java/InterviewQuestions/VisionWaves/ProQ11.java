package VisionWaves;

public class ProQ11 {
	
//	Q11] Duplicate elements in array
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,3,5,2,4,6,3,8};
		System.out.println("Duplicate Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.print(arr[i] + " " );
				}
			}
		}
		
	}

}
