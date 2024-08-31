package ComparableInterface;

public class Student implements Comparable<Student> {
	
	String name;
	int yop ;
	String branch ;
	String course ;
	double price ;
	
	public Student(String name, int yop, String branch, String course, double price) {
		super();
		this.name = name;
		this.yop = yop;
		this.branch = branch;
		this.course = course;
		this.price = price;
	}
	
	public String toString() {
		return "{ Name : " + name + " , Year Of Passout : " + yop + " , Branch : " + branch + " , Course Enrolled : " + course + " , Fees Paid : " +price+" }";
		
	}

//	@Override
//	public int compareTo(Student o) {
//		return Double.compare(this.price, o.price);
//	}

//	@Override
//	public int compareTo(Student o) {
//		return this.branch.compareTo(o.branch);
//	}

//	@Override
//	public int compareTo(Student o) {
//		return Integer.compare(this.yop, o.yop);
//	}

//	@Override
//	public int compareTo(Student o) {
//		if (this.yop>o.yop) {
//			return 1;
//		}
//		else if (this.yop<o.yop) {
//			return -1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

//	@Override
//	public int compareTo(Student o) {
//		if(this.name.charAt(0)<o.name.charAt(0)) {
//			return -1;
//		}
//		else if(this.name.charAt(0)>o.name.charAt(0)) {
//			return 1;
//		}
//		return 0;
//	}
	
	
	
}
