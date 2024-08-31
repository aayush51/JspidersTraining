package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AL12 {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(102);
		al.add(104);
		al.add(103);
		al.add(105);
		
		ListIterator<Integer> i = al.listIterator();
		System.out.println(i.hashCode());
		if(i.hasNext()) {
			while (i.hasNext()) {
				System.out.println(i.next());
			}
		}
		if(i.hasPrevious()) {
			while (i.hasPrevious()) {
				System.out.println(i.previous());
			}
		}
		System.out.println(i.hashCode());
	
	}
	
}
