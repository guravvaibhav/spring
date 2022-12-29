package com.durgesh.many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name ="xyz",query = "from Project where Project_id=:x")			//to write single named query
//@NamedQueries																// to write multiple named queries
//	({
//	@NamedQuery(name ="xyz",query = "from Project where Project_id=:x"),
//	@NamedQuery(name ="abc",query = "from Project where Project_id=:y")
//	})
public class Project {
	@Id
	private int project_id;
	private String project_nm;
	@ManyToMany
	private List<EmployeeP> employees;
	
	public Project() {
		super();
	}

	public Project(int project_id, String project_nm, List<EmployeeP> employees) {
		super();
		this.project_id = project_id;
		this.project_nm = project_nm;
		this.employees = employees;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_nm() {
		return project_nm;
	}

	public void setProject_nm(String project_nm) {
		this.project_nm = project_nm;
	}

	public List<EmployeeP> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeP> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_nm=" + project_nm + ", employees=" + employees + "]";
	}
	
	
	
	
	

}
