package com.ExceptionTypes.org;

public class ArrayIndexoutofBoundryException {
	
	public static void main(String[] args) {
			
			System.out.println("Before Exception");
		
		try {
			
			int [] a = new int [5];
			System.out.println(a[7]);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("After Exception");
		}
		
		
		
	}
	
	
	
	

}
