package fullAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("10")
	int pin;
	@Value("kop")
	String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	

}
