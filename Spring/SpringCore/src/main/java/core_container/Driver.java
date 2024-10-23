package core_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Driver {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("config.xml");
		BeanFactory bean = new XmlBeanFactory(resource);
		
		Student stud = (Student) bean.getBean("myStudent");
		stud.study();

	}
}