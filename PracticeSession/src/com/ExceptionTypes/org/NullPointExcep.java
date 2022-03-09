package com.ExceptionTypes.org;

public class NullPointExcep {

	 static String a;
	
	public static void main(String[] args) {
		System.out.println(a);
		
		
		try {
			int length = a.length();
			System.out.println(length);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Next Output");
		
		
	}
	
}
