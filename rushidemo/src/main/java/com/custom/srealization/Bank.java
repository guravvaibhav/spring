package com.custom.srealization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bank implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", password=" + password + ", pin=" + pin + "]";
	}

	int id;
	String name;
	transient String password;
	transient int pin;

	public Bank() {
		super();
	}

	public Bank(int id, String name, String password, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.pin = pin;
	}

	private void writeObject(ObjectOutputStream oos) throws Exception {

		oos.defaultWriteObject();
		String epass = password + "123";
		oos.writeObject(epass);
		int epin = pin * 2;
		oos.writeInt(epin);
	}

	private void readObject(ObjectInputStream ois) throws Exception {

		ois.defaultReadObject();
		String epass = (String) ois.readObject();
		password = epass.substring(0, epass.length() - 3);
		int epin = (int) ois.readInt();
		pin = epin / 2;
	}

}
