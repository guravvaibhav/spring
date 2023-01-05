package fullAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	ApplicationContext ct= new AnnotationConfigApplicationContext(Config.class);
	System.out.println(ct.getBean("add1",Address.class));
	System.out.println(ct.getBean("student1",Student.class));

	}
}
