package springExample.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		
		ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("data.xml");
		
		Student student=(Student)factory.getBean("studentbean");
		System.out.println(student);
		factory.refresh();
	}
}
