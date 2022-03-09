package com.CollectionsTopic.org;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListCollection {
	
	public static void main(String[] args) {
		
		List<Object> task = new ArrayList<Object>();
		
		task.add("My");
		task.add("Name");
		task.add("Is");
		task.add("Rajavel");
		task.add("Software");
		task.add("Testing");
		task.add("Engineer");
		task.add("2021");
		
		int size = task.size();
		System.out.println(size);
		
		task.add(5, "Automation");
		System.out.println(task);
			
		boolean contains = task.contains("Rajavel");
		System.out.println(contains);
		
		boolean contains2 = task.contains("2021");
		System.out.println(contains2);
		
		for (Object object : task) {
			System.out.println(object);
			}
		
		task.add("Ganesan");
		System.out.println(task);
		
		int size2 = task.size();
		System.out.println(size2);
		
		 List<Object>task2 = new ArrayList<Object>();
		 task2.add('G');
		 task2.add('R');
		 task2.add('K');
		 System.out.println(task2);
		 
		 task2.addAll(task);
		 System.out.println(task2);
		 
		 task2.remove("Software");
		 System.out.println(task2);
		 
		 task2.remove(3);
		 System.out.println(task2);
		 
		 boolean empty = task2.isEmpty();
		 System.out.println(empty);
		 
		 task.clear();
		 System.out.println(task);
		 
		 int size3 = task2.size();
		 System.out.println(size3);
		 
		 
		 
		 
		
		
		}
		
		
	}


