package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet02 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Mahesh");
		hs.add("Mahesh");
		hs.add('H');
		hs.add('H');
		hs.add('F');
		hs.add('B');
		hs.add(25);
		hs.add(36);
		hs.add(39);
		hs.add(99);
		hs.add(99);
		hs.add(99);
		hs.add(99);
		hs.add(new Home(3,"Karve Nagar",false,"1BHK",13000,20000));
		
		System.out.println(hs);
		
		Iterator i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
//		for (Object obj : hs) {
//			System.out.println(obj);
//		}
		
		
	}
}
