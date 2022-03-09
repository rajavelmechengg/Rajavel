package com.AllTestNG_Functions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test (invocationCount = 7)
	private void mobile() {
		System.out.println("Mobile");
	}
	
	@Test(invocationCount = 3)
	private void laptop() {
		System.out.println("Laptop");
	}
	
	@Test(invocationCount = 2)
	private void clothings() {
		System.out.println("Clothings");
	}
	

}
