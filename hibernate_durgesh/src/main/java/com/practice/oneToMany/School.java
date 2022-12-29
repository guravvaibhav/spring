package com.practice.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int School_id;
	private String Schoolnm;
	private String city;
	@OneToMany(mappedBy = "school")
	private List<StudentS> students;
	
	public School() {
		super();
	}

	public School(String schoolnm, String city, List<StudentS> students) {
		super();
		Schoolnm = schoolnm;
		this.city = city;
		this.students = students;
	}

	public int getSchool_id() {
		return School_id;
	}

	public void setSchool_id(int school_id) {
		School_id = school_id;
	}

	public String getSchoolnm() {
		return Schoolnm;
	}

	public void setSchoolnm(String schoolnm) {
		Schoolnm = schoolnm;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<StudentS> getStudents() {
		return students;
	}

	public void setStudents(List<StudentS> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "School [School_id=" + School_id + ", Schoolnm=" + Schoolnm + ", city=" + city + ", students=" + students
				+ "]";
	}

	
	
	
}
