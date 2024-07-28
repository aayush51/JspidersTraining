package Encapsulation.OnlineCourseManage;

//Objective: Create a Course class to manage online courses.
//
//Private fields: courseId, courseName, instructor, enrolledStudents
//Public methods: getCourseId(), getCourseName(), getInstructor(), getEnrolledStudents(), addStudent(String studentName), removeStudent(String studentName)

public class Course {
	
	private int courseId;
	private String courseName;
	private String instructor;
	private int noOfStudents;

	public Course() {

	}

	public Course(int courseId, String courseName, String instructor, int noOfStudents) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.noOfStudents = noOfStudents;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public int getNoOfStudents() {
		return noOfStudents;
	}
	
	public void addStudent(String studentName) {
		noOfStudents++;
		System.out.println(studentName + " has been added to the course");
	}
	
	public void removeStudent(String studentName) {
		noOfStudents--;
		System.out.println(studentName + " has been removed from the course");
	}
	
	public void displayCourseDetails() {
		System.out.println("Course ID: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Instructor: " + instructor);
		System.out.println("No. of students: " + noOfStudents);
	}
	
	

}
