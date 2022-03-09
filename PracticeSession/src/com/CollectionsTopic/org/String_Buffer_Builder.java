package com.CollectionsTopic.org;import java.security.Identity;

public class String_Buffer_Builder {

	public static void main(String[] args) {
		
		String a  = "Rajavel";
		String a1 = "Rajavel";
		
		System.out.println(System.identityHashCode(a));
		
		System.out.println(System.identityHashCode(a1));
		
		String concat = a.concat(a1);
		
		System.out.println(concat);
		
		System.out.println(System.identityHashCode(concat));
		
		System.out.println(a);
		
		
		System.out.println("................................String Buffer......................................");
		
		
		StringBuffer b  = new StringBuffer("Kamaraj");
		StringBuffer b1 = new StringBuffer("Kamaraj");
		
		System.out.println(System.identityHashCode(b));
		
		System.out.println(System.identityHashCode(b1));
		
		int length = b.length();
		System.out.println(length);
		
		StringBuffer append = b.append(b1);
		
		System.out.println(append);
		
		System.out.println(System.identityHashCode(append));
		
		System.out.println(b);
		
		int length1 = b.length();
		System.out.println(length1);
		
		StringBuffer reverse = b.reverse();
		System.out.println(reverse);
		
		int capacity = b.capacity();
		System.out.println(capacity);
		
		
		
		System.out.println(".................................String Builder..............................");
		
		
		StringBuilder c  = new StringBuilder("Ganesan");
		StringBuilder c1 = new StringBuilder("Ganesan");
		
		System.out.println(System.identityHashCode(c));
		
		System.out.println(System.identityHashCode(c1));
		
		StringBuilder append2 = c.append(c1);
		
		System.out.println(append2);
		
		System.out.println(System.identityHashCode(append2));
		
		System.out.println(c);
	}
}
