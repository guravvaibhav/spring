package com.custom.exception;

public class Bank {
	
	int bal =500;
	String AccHoldername;
	String brName;
	int withdraw ;
	public Bank(String accHoldername, String brName, int withdraw) {
		super();
		AccHoldername = accHoldername;
		this.brName = brName;
		this.withdraw = withdraw;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getAccHoldername() {
		return AccHoldername;
	}
	public void setAccHoldername(String accHoldername) {
		AccHoldername = accHoldername;
	}
	public String getBrName() {
		return brName;
	}
	public void setBrName(String brName) {
		this.brName = brName;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bal, String accHoldername, String brName) {
		super();
		this.bal = bal;
		AccHoldername = accHoldername;
		this.brName = brName;
	}
	@Override
	public String toString() {
		return "Bank [bal=" + bal + ", AccHoldername=" + AccHoldername + ", brName=" + brName + "]";
	}
	
	

}
