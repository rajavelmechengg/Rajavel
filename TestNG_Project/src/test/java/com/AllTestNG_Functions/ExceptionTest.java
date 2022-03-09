package com.AllTestNG_Functions;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test
	private void add() {
		int a = 5;
		int b = 13;
		System.out.println("Add Output : "+ (a+b));
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void div() {
		int a = 8;
		int b = 0;
		int c = a/b;
		System.out.println("Divition output : "+ c);
	}
	
	@Test(expectedExceptions = Exception.class)
	private void multi() {
		int a = -5;
		int b = 0;
		int c = a/b;
		System.out.println("Ouyput : "+ c);
	}
	
	

}
