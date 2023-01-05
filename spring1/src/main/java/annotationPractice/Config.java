package annotationPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

//@Configuration
@ComponentScan(basePackages = "annotationPractice" )
public class Config {
	@Bean(name = "p1")@Lazy@Scope(value="prototype")
	public static Project getP1() {
		return new Project(123, "telicom");
	}
	@Bean(name="p2")
	@Primary@Scope(value="prototype")
	public static Project getP2() {
		return new Project(456, "banking");
	}
	@Bean(name="e1")@Scope(value="prototype")
	public static Employee getE1() {
		return new Employee(10,"sham",null);
	}

}
