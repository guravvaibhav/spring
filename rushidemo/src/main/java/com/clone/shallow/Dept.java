package com.clone.shallow;

public class Dept {
	int deptid;
	String deptName;
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptName=" + deptName + "]";
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Dept() {
		super();
	}
	public Dept(int deptid, String deptName) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
