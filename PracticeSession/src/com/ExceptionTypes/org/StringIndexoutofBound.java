package com.ExceptionTypes.org;

public class StringIndexoutofBound {
	
	static String s = "Rajavel";
	
	public static void main(String[] args) {
		System.out.println(s);
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		
	}

}
