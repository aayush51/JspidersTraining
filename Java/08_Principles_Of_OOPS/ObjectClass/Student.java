package ObjectClass;

public class Student extends Object {
	
	String name;
	int age;
	String grade;
	int percentage;

	public Student() {
		super();
	}

	public Student(String name, int age, String grade, int percentage) {
        super();
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.percentage = percentage;
	}

	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nGrade: " + grade + "\nPercentage: " + percentage;
	}

	public boolean equals(Object obj) {
		Student s = (Student) obj; // Down casting
		if (this.name == s.name && this.age == s.age && this.grade == s.grade && this.percentage == s.percentage) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int hc = 0;
		hc = hc + name.hashCode() + age + grade.hashCode() + percentage;
		return hc;
	}

}
