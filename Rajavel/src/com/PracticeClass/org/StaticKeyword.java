package com.PracticeClass.org;

public class StaticKeyword {
	
	static int a=333;
	
	static {   // Static Block this will get executed before the main method
		System.out.println("This is Static Keyword  (Without any Method)");
		test1();
		System.out.println(a);
	}
	
	//static int a = 255;
	
	public static void test1() {  // Static methods can't be override
		System.out.println("Method Level Static KeyWord");  // Static can be used in method level.
	}
	
	public static void main(String[] args) {
		System.out.println("Direct Call");
		//System.out.println(a);  // Static Variable can be called without using an object.
		//test1();
	}

}
