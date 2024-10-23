package qualifier_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(myConfig.class);
		Person person = (Person) ac.getBean("person");
		Mobile mobile = person.getMobile();
		mobile.call();
		
	}

}
