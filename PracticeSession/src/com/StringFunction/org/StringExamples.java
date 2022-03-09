package com.StringFunction.org;

public class StringExamples {
private static final char[] CharSequence = null;

public static void main(String[] args) {
	
String s = "Results or Excuses,you choose.";

int length = s.length();
System.out.println(length);

	
boolean equals = s.equals("Results or excuses,you choose.");
System.out.println(equals);


boolean equalsIgnoreCase = s.equalsIgnoreCase("Results or excuses,you choose.");
System.out.println(equalsIgnoreCase);	


char charAt = s.charAt(14);
System.out.println(charAt);

int indexOf = s.indexOf('t');
System.out.println(indexOf);	
	
}
}
