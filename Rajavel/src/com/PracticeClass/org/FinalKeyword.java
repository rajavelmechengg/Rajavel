package com.PracticeClass.org;

public final class FinalKeyword {  // Final class cant't be inherited.
	
	static {
		System.out.println("Hello Java");
	}
	
	static int a =44;
	
	public final static void test1() { // Final method can't override.
		final int  k = 20; // Final variable value cannot be changed.
		System.out.println("Hai");
	}
	public static void main(String[] args) {
		test1();
		System.out.println(a);
	}

}
