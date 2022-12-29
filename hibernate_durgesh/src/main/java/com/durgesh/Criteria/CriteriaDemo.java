package com.durgesh.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.durgesh.embeddable.Student1;
import com.durgesh.many_to_many.Project;
import com.hibernate.util.Hib_util;

public class CriteriaDemo {
	public static void main(String[] args) {
		
	SessionFactory f=Hib_util.getFactory();
	Session s=f.openSession();
	Criteria c=s.createCriteria(Project.class);
	Criteria add = c.add(Restrictions.eq("project_id", 102));
//	c.add(Restrictions.like("project_id", 102));
	c.add(Restrictions.between("project_id", 102, 103));
	c.add(Restrictions.isNull("project_id"));
	c.add(Restrictions.isEmpty("project_id"));
	c.add(Restrictions.like("project_id", 102));
	List<Project> list=c.list();
//	c.setF
	for(Project e:list) {
//		System.out.println(e);
		System.out.println(e.getProject_id()+" "+e.getProject_nm());
	}

	
	
	}

	
	
}
