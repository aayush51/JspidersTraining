package VisionWaves;

import java.util.Arrays;

public class ProQ12 {
	
//	Q12] Remove element from array
	
	public static void main(String[] args) {
		int[] ar = {22,55,11,9,6,64,12,19,75};
		int[] b = removeElement(22,ar);
		System.out.println(Arrays.toString(b));
	}
	
	public static int[] removeElement(int element,int[] array) {
		int[] arrayCopy = new int[array.length-1];
		int it = 0 ;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != element) {
				arrayCopy[it++] = array[i];
			}
		}
		return arrayCopy;
	}

}
