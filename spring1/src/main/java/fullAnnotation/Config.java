package fullAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "fullAnnotation")
public class Config {
	@Bean(name = "add1")
	public static Address getAdd1() {
		return new Address(234, "pune");
	}
	@Bean(name = "add2")
	@Primary
	public static Address getAdd2() {
		return new Address(123, "mumbai");
	}
	@Bean(name = "student1")
	@Primary
	public static Student getStudent1() {
		return new Student(90, "abc", getAdd1());
	}

}
