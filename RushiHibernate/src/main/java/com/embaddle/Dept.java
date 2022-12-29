package com.embaddle;

import javax.persistence.Embeddable;

@Embeddable
public class Dept {
	
	private int deptid;
	private String deptnm;
	private String projectnm;
	private double pro_budget;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int deptid, String deptnm, String projectnm, double pro_budget) {
		super();
		this.deptid = deptid;
		this.deptnm = deptnm;
		this.projectnm = projectnm;
		this.pro_budget = pro_budget;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptnm() {
		return deptnm;
	}
	public void setDeptnm(String deptnm) {
		this.deptnm = deptnm;
	}
	public String getProjectnm() {
		return projectnm;
	}
	public void setProjectnm(String projectnm) {
		this.projectnm = projectnm;
	}
	public double getPro_budget() {
		return pro_budget;
	}
	public void setPro_budget(double pro_budget) {
		this.pro_budget = pro_budget;
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptnm=" + deptnm + ", projectnm=" + projectnm + ", pro_budget="
				+ pro_budget + "]";
	}
	
	

}
