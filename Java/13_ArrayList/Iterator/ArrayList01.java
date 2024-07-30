package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList01 {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator<Integer> i = al.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.next());	//java.util.NoSuchElementException
		
		
	}

}
