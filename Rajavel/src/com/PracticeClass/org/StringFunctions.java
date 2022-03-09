package com.PracticeClass.org;

public class StringFunctions {
	public static void main(String[] args) {
		String a = "If you want to reach that goal stay focused";
		
		int length = a.length();
		System.out.println(length);
		
		boolean equals = a.equals("if you want to reach that goal stay focused");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase("if you want to reach That goal stay focused");
		System.out.println(equalsIgnoreCase);
		
		char charAt = a.charAt(7);
		System.out.println(charAt);
		
		int indexOf = a.indexOf('w');
		System.out.println(indexOf);
		
		boolean contains = a.contains("goal");
		System.out.println(contains);
		
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
	
		boolean startsWith = a.startsWith("If you" );
		System.out.println(startsWith);
		
		boolean endsWith = a.endsWith("focused");
		System.out.println(endsWith);
		
		String replace = a.replace('w','z');
		System.out.println(replace);
		
		String replace2 = a.replace("you","me" );
		System.out.println(replace2);
		
		String replace3 = a.replace("reach","achieve");
		System.out.println(replace3);
		
		String replaceFirst = a.replaceFirst("If","are");
		System.out.println(replaceFirst);
		
		String substring = a.substring(1,18);
		System.out.println(substring);
		
		CharSequence subSequence = a.subSequence(1,25);
		System.out.println(subSequence);
		
		
		// 2nd Method starts here
		
		
		/*String[] x = a.split(" ", 5);
		
		for (String word : x) {
			System.out.println(word);
		}
		
		String[] y = a.split(" ");
		
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}*/
		
		
		String[] x = a.split(" ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			
		}
		
		String[] y = a.split(" ", 4);
		for (String word : y) {
			System.out.println(word);
		}
		}
		
		}
		


