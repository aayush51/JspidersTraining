package Encapsulation.OnlineCourseManage;

public class CourseDriver {

	public static void main(String[] args) {
		Course c1 = new Course(1, "Java", "Rahul", 10);

		c1.displayCourseDetails();
		System.out.println("----------------------------------------------");

		c1.addStudent("Rohit");
		c1.displayCourseDetails();
		System.out.println("----------------------------------------------");

		c1.removeStudent("Rohit");
		c1.displayCourseDetails();
		System.out.println("----------------------------------------------");

	}

}
