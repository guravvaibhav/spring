package annotationPractice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  
@Scope(value = "singleton")
public class Employee {
	int empId;
	String name;
	@Autowired 
	@Qualifier("p1")
	Project p;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, Project p) {
		super();
		this.empId = empId;
		this.name = name;
		this.p = p;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getP() {
		return p;
	}
	public void setP(Project p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", p=" + p + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init method of employee");
	}
	
	

}
