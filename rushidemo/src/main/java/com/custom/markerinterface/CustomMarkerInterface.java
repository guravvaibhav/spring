package com.custom.markerinterface;

interface Deletable {

}

class Test implements Deletable {

	// Other Methods
}

public class CustomMarkerInterface {
	
	public static boolean delete(Object obj) {
		if (obj instanceof Deletable)
			return true; // Logic for Delete
		else
			return false; // Not Delete
	}

	public static void main(String[] args) {
		
		String s=new String ("Rushi");
		Test t=new Test();
		CustomMarkerInterface c=new CustomMarkerInterface();
		
		System.out.println(delete(s));
		System.out.println(delete(t));
		System.out.println(delete(c));
	}

	

}
