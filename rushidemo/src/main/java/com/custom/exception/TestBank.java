package com.custom.exception;

public class TestBank {

	public static void main(String[] args) {
		Bank b1=new Bank("Rushi","BOI",300);
		System.out.println(withdraw(b1));
	}
	public static boolean withdraw(Bank b) {
		if(b.withdraw<b.bal)
		{
			return true;
		}
		else
			throw new InsuffcientBalance("Balance not Available");
		
	}

}
