package CollectionsClass;

import java.util.Collections;
import java.util.HashSet;

public class PrimType {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(11);
		hs1.add(2);
		hs1.add(33);
		hs1.add(33);
		hs1.add(33);
		hs1.add(4);
		hs1.add(5);
		hs1.add(6);
		hs1.add(7);
		hs1.add(8);
		hs1.add(90);
		hs1.add(90);
		hs1.add(90);
		hs1.add(10);
		hs1.add(111);
		hs1.add(122);
		hs1.add(134);
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(590);
		hs2.add(433);
		hs2.add(231);
		System.out.println(hs1);
//		System.out.println(Collections.sort(hs1));
		System.out.println(Collections.max(hs1));
		System.out.println(Collections.min(hs1));
		System.out.println(Collections.disjoint(hs1, hs2));
		System.out.println(Collections.frequency(hs1, 90));
//		System.out.println(Collections.indexOfSubList(hs1, 90));
		System.out.println(Collections.max(hs1));
		System.out.println(Collections.min(hs1));
//		System.out.println(Collections.shuffle(hs1));
	}

}
