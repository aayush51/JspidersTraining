package ProgramsOnArray2;

public class LengthOfArray {
	
	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,6,7,8,9};
		int count = 0 ;
		try {
			for (int i = 0; ;i++) {
				ar[i] = ar[i];
				count++;
			}
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(count);
		}
	}

}
