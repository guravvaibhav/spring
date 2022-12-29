package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	int roll;
	String name;
	List<String> subjects;
	Set<Integer> mob;
	Map<String, Integer> subMarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, List<String> subjects, Set<Integer> mob, Map<String, Integer> subMarks) {
		super();
		this.roll = roll;
		this.name = name;
		this.subjects = subjects;
		this.mob = mob;
		this.subMarks = subMarks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<Integer> getMob() {
		return mob;
	}

	public void setMob(Set<Integer> mob) {
		this.mob = mob;
	}

	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subjects=" + subjects + ", mob=" + mob + ", subMarks="
				+ subMarks + "]";
	}

}
