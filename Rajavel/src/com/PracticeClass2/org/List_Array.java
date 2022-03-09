package com.PracticeClass2.org;

import java.util.ArrayList;
import java.util.List;

public class List_Array {

	public static void main(String[] args) {
	
		List<Object> Example = new ArrayList<Object>();
		Example.add("Raj");
		Example.add("Vel");
		Example.add("GR");
		Example.add("29");
		Example.add("December");
		Example.add(2021);
		
		int size = Example.size();
		System.out.println(size);
		
		Example.add("Rajavel");
		System.out.println(Example);
		
		boolean contains = Example.contains("GR");
		System.out.println(contains);
	
	
	}
}
