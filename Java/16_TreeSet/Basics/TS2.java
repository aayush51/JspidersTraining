package Basics;

import java.util.TreeSet;

public class TS2 {
	
	public static void main(String[] args) {
		
		TreeSet ts1 = new TreeSet();	//- TreeSet is a raw type. References to generic type TreeSet<E> should be parameterized
		
		ts1.add(1);		//Type safety: The method add(Object) belongs to the raw type TreeSet. References to generic type TreeSet<E> should be parameterized
		ts1.add(122853485);
		ts1.add("Together");	//Class Cast Exception
		ts1.add('Y');
		ts1.add(true);
		ts1.add(false);
		ts1.add(true);
		ts1.add(0.222263);
		ts1.add(1);
		ts1.add(1);
		ts1.add(1);
		System.out.println(ts1);
		
	}

}
