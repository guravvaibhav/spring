package com.durgesh.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.Hib_util;

public class TestManyToMany {
	public static void main(String[] args) {
		List<Project> project1=new ArrayList<>();
		List<EmployeeP> employees1= new ArrayList<>();
		
		EmployeeP emp1=new EmployeeP(1111, "ram", project1);
		EmployeeP emp2=new EmployeeP(2222, "shyam", project1);
		
		Project p1=new Project(101, "telicom", employees1);
		Project p2=new Project(102, "insurance", employees1);
		
		project1.add(p1);
		project1.add(p2);
		
		employees1.add(emp1);
		employees1.add(emp2);
		
		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession();){
			Transaction tr=session.beginTransaction();
			session.save(emp1);
			session.save(emp2);
			session.save(p1);
			session.save(p2);
			
			
			tr.commit();
			
//			Project p=(Project)session.get(Project.class, 101);
//			System.out.println(p.getProject_nm());
//			System.out.println(p.getEmployees().get(0).getEmp_name());
//			System.out.println(p.getEmployees().get(1).getEmp_name());
			
		}
	}

}
