package com.autowire;

public class Test {

public static void main(String[] args) {
	String s1=new String ("ram");
	String s2=s1.intern();
	System.out.println(s1==s2);
}
}