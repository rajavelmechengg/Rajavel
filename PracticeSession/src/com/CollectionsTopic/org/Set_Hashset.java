package com.CollectionsTopic.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Hashset {
	
	public static void main(String[] args) {
		
		Set<Object> t1 = new HashSet<>();
		
		t1.add(11);
		t1.add(22);
		t1.add(33);
		t1.add("44");
		t1.add("55");
		t1.add("66");
		
		System.out.println(t1);
		
		int size = t1.size();
		System.out.println(size);
		
		t1.add(93);
		System.out.println(t1);
		
		t1.add(83);
		System.out.println(t1);
		
		boolean contains = t1.contains("Java");
		System.out.println(contains);
		
		t1.add("Raja");
		System.out.println(t1);
		
		t1.add(null);
		System.out.println(t1);
		
		Set<Object> t2 = new LinkedHashSet<Object>();
		t2.add("AB");
		t2.add("CD");
		t2.add("EF");
		t2.add("GH");
		
		System.out.println(t2);
		
		t2.addAll(t1);
		System.out.println(t2);
		
		List<Object> t3 = new ArrayList<Object>();
		t3.add("30");
		t3.add("10");
		t3.add("40");
		t3.add("20");
		System.out.println(t3);
		
		t3.addAll(t2);
		System.out.println(t3);     
		
		
		
		
	}

}
