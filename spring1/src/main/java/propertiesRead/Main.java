package propertiesRead;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "propertiesRead")
@PropertySource("classpath:connection.properties")
public class Main {
	String url;
	String user;
	String passward;

}
