package com.ExceptionTypes.org;

public class ArthematicException {

	public void method1() {

		try {
			
			System.out.println("Before Exception");
			
			System.out.println(50/0);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("After Exception");
		}
	}
	public static void main(String[] args) {
		ArthematicException m = new ArthematicException();
		m.method1();
	}
}
