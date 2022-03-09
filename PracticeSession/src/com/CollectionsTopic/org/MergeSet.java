package com.CollectionsTopic.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeSet {
	
	public static void main(String[] args) {
		
		Set<String> a = new HashSet<String>();
		a.add("10");
		a.add("15");
		a.add("30");
		a.add("40");
		a.add("50");
		
		System.out.println(a);
		
		Set<String> b = new LinkedHashSet<String>();
		b.add("44");
		b.add("22");
		b.add("11");
		b.add("33");
		b.add("55");
		
		System.out.println(b);
		
		b.addAll(a);
		System.out.println(b);
		
		Set<String> c = new TreeSet<>();    //In Tree Set Object method cant merge the sets.
		c.add("93");
		c.add("83");
		c.add("23");
		c.add("63");
		
		System.out.println(c);
		
		c.addAll(b);
		System.out.println(c);
		
		List<Object> d = new ArrayList<Object>();
		d.add("Raj");
		d.add("Vel");
		d.add("GR");
		
		System.out.println(d);
		
		d.addAll(c);
		System.out.println(d);
		
		
		
		
		
	}

}
