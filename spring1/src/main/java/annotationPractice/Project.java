package annotationPractice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component@Scope(value="singleton")
public class Project {
	private int pro_id;
	private String name;
	public Project() {
		super();
	}

	public Project(int pro_id, String name) {
		super();
		this.pro_id = pro_id;
		this.name = name;
	}
	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Project [pro_id=" + pro_id + ", name=" + name + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init method of project");
	}

}
