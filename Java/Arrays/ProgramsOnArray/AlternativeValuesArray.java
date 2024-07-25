package ProgramsOnArray;

public class AlternativeValuesArray {
	public static void main(String[] args) {
		int [] a = {20,50,60,40,90,10,2};
		
		for (int i = 0 ; i < a.length ; i+=2 ) {
			System.out.println(a[i]);
		}
	}

}
