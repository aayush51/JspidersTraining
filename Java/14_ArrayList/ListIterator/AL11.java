package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AL11 {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		ListIterator<Integer> it = al.listIterator();
		System.out.println("hasNext:"+it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println("hasNext:"+it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println("hasPrevious:"+it.hasPrevious());
		System.out.println("hasNext:"+it.hasNext());
		System.out.println(it.previous());
		System.out.println(it.previous());
		System.out.println(it.previous());
		System.out.println(it.previous());
		System.out.println(it.previous());
		System.out.println("hasPrevious:"+it.hasPrevious());
//		System.out.println(it.previous());		//NoSuchElementException
		
	}

}
