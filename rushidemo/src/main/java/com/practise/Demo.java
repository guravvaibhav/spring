package com.practise;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		String s="Rushi Patil";
		List l=new ArrayList();
		for(char c:s.toCharArray()) {
			if(c !=' ')
			l.add(c);
		}
		System.out.println(l);
			
	}

}
