package Basics;

public class Student {
	
	String name;
	int year;
	String stream;
	
	Student() {
		super();
	}
	
	Student(String name, int year, String stream){
		this.name = name;
		this.year = year;
		this.stream = stream;
	}
	public String toString(){
		return "[ Name: " + name + " Year: " + year + " Stream: " + stream + "]";
	}
}
