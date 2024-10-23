package j2ee_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml") ;
		StudentA stud = (StudentA) ac.getBean("myStudent");
		stud.study();

	}
}