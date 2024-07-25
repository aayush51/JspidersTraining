package ObjectClass;

public class StudentDriver {
	
	public static void main(String[] args) {
		Student s1 = new Student("Mahesh", 18, "A", 90);
        Student s2 = new Student("Mahesh", 18, "A", 90);
        Student s3 = new Student("Tejas", 18, "A", 90);
        Student s4 = new Student("Tejas", 18, "A", 90);
        Student s5 = new Student("Tejas", 18, "A", 90);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        
		System.out.println("-------------------------------------------------------------");
		Student s6 = new Student("Anish", 18, "A", 90);
		Student s7 = new Student("Anish", 19, "B", 90);
		System.out.println(s6.toString());
		System.out.println(s7.toString());
		System.out.println(s6.equals(s7));
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
		System.out.println("-------------------------------------------------------------");

	}

}
