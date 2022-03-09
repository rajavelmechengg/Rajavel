package com.CollectionsTopic.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Linked {
	
	public static void main(String[] args) {
		
		List<Object> ex = new ArrayList<Object>();
		
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		ex.add("Raja");
		ex.add(3.33);
		
		System.out.println(ex);
		
		int size = ex.size();
		System.out.println(size);
		
		ex.add(6, "Vel");
		System.out.println(ex);
		
		ex.add("GR");
		System.out.println(ex);
		
		Object object = ex.get(5);
		System.out.println(object);
		
		ex.set(1,"Tweenty" );
		System.out.println(ex);
		
		List<Object> a = new ArrayList<Object>();
		a.add("Collection");
		a.add("Array List");
		a.add("Linked List");
		a.add("Vector List");
		
		
		System.out.println(a);
		
		a.addAll(ex);
		System.out.println(a);
		
		ex.remove(4);
		System.out.println(ex);
		
		ex.remove("Vel");
		System.out.println(ex);
		
		boolean contains = ex.contains("Raja");
		System.out.println(contains);
		
		boolean contains2 = ex.contains("Vel");
		System.out.println(contains2);
		
		//ex.clear();
		//System.out.println(ex);
		
		System.out.println(".................Next...................");
		
		Iterator<Object> iterator = ex.iterator(); //Iterator Only Fwd transverse
		while (iterator.hasNext()) {
			Object object2 = (Object) iterator.next();
			System.out.println(object2);	
		}
		
		System.out.println("....................Next......................");
		
		ListIterator<Object> iter = ex.listIterator(); //ListIterator Both Fwd and Backward
		while (iter.hasNext()) {
			Object object2 = (Object) iter.next();
			System.out.println(object2);	
		}
		
		System.out.println(".....................Next.......................");
		
		while (iter.hasPrevious()) {
			Object object2 = (Object) iter.previous();
			System.out.println(object2);
		}
		
		System.out.println(".......................Next.......................");
		
		
			
		}
		
		
		
		
		
	}


