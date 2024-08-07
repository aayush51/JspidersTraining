package ExceptionHandlingBeta;

import java.util.ArrayList;
import java.util.Collections;

public class Comp implements Comparable<Integer> {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(50);
		System.out.println(list);
		
		Collections.sort(list);
		
	}

	@Override
	public int compareTo(Integer o) {
		if (this.equals(o)) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
