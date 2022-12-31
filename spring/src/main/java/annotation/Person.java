package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("123")
	int pId;
	@Value("ram")
	String name;
	
	Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(int pId, String name, Address address) {
		super();
		System.out.println("Con invoked");
		this.pId = pId;
		this.name = name;
		this.address = address;
	}
	
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter invoked");
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", address=" + address + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("in it method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}

}
