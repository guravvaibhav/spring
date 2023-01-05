package annotationPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ct=new AnnotationConfigApplicationContext(Config.class);
		Employee e=ct.getBean("employee",Employee.class);
		Employee e1=ct.getBean("employee",Employee.class);
		System.out.println(e==e1);
		
		Project p10=ct.getBean("project",Project.class);
		Project p20=ct.getBean("project",Project.class);
		System.out.println(p10==p20);
		
		Project p= ct.getBean("p1",Project.class);
		Project p1= ct.getBean("p1",Project.class);
		System.out.println(p==p1);
		
		
		Project p2= ct.getBean("p2",Project.class);
		System.out.println(p==p2);
		Employee e2=ct.getBean("e1",Employee.class);
	}

}
