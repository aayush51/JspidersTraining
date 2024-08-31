package ComparableInterface;

import java.util.*;

public class BatchA1 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> Group1 = new ArrayList<Student>();
		Group1.add(new Student("Mahesh",2024,"CS","Full Stack Development",30000));
		Group1.add(new Student("Suresh",2021,"IT","Back End Development",15000));
		Group1.add(new Student("Nikita",2022,"EC","Full Stack Development",30000));
		Group1.add(new Student("Anish",2024,"CS","Full Stack Development",30000));
		Group1.add(new Student("Mitali",2023,"ENTC","Front End Development",13000));
		Group1.add(new Student("Tushar",2024,"AIML","Java Development",26000));
		Group1.add(new Student("Yash",2022,"CS","Java Development",26000));
		Group1.add(new Student("Vishwajeet",2023,"AIML","Back End Development",16000));
		Group1.add(new Student("Avantika",2021,"EC","Front End Development",12000));
		Group1.add(new Student("Anita",2023,"IT","Java Development",26000));
		Group1.add(new Student("Sakshi",2024,"CS","Python Development",21000));
		Group1.add(new Student("Ganesh",2023,"CS","Python Development",21000));
		Group1.add(new Student("Rahul",2024,"IT","API Development",12000));

//		Collections.sort(Group1);//Without compareTo() Overriding Error-The method sort(List<T>) 
								//in the type Collections is not applicable for the arguments 
								//(ArrayList<Student>)
		
		Collections.sort(Group1);
		for(Student s1:Group1) {
			System.out.println(s1);
		}
		
	}

}
