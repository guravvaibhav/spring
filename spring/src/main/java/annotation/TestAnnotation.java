package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cxt=new ClassPathXmlApplicationContext("AnnotationCfg.xml");
		Person bean = cxt.getBean("person",Person.class);
		System.out.println(bean);
		cxt.registerShutdownHook();
		

	}

}
