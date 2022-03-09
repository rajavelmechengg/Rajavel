package com.ExceptionTypes.org;

import java.util.ArrayList;
import java.util.List;

public class IndexoutofBoundryEx {

	public static void main(String[] args) {
		
		List<Object> a = new ArrayList<Object>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		
		try {
			Object object = a.get(5);
			System.out.println(object);
			
		} finally {
			
			System.out.println("Finally Block");
		}
		
		
	}
}
