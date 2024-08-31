package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer> ();
		hs1.add(1);
		hs1.add(1);
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(4);
		hs1.add(4);
		hs1.add(5);
		hs1.add(6);
		hs1.add(7);
		
		System.out.println(hs1);
		
		Iterator<Integer> i = hs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		for (Integer val : hs1) {
//			System.out.println(val);
//		}
		
	}

}
