package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Student s[] = new Student[3];
		s[0] = new Student("Raju",3,"CS");
		s[1] = new Student("Rani",2,"IT");
		s[2] = new Student("Avdhut",4,"ENTC");
		
		System.out.println(Arrays.toString(s));
		
		/********************************************************************************/		
		
		ArrayList al = new ArrayList();
		al.add(new Student("Raju",3,"CS"));
		al.add(new Student("Rani",2,"IT"));
		al.add(new Student("Avdhut",4,"ENTC"));
		
		for (Object object : al) {
			Student stud = (Student) object;
			System.out.println(stud.name);
		}
	}
	
}
