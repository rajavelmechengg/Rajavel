package com.ExceptionTypes.org;

public class NumberFormatEx {
	
	public static void main(String[] args) {
		
		String s = "12tgh56";
		
		int s1 = Integer.parseInt(s);
		System.out.println(s1);		
				
		String valueof = String.valueOf(s1);
		System.out.println(valueof);
		
		Integer valueof2 = Integer.valueOf(s1);
		System.out.println(valueof2);
	}

}
