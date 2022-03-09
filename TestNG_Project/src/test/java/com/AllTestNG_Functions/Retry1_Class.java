package com.AllTestNG_Functions;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Retry1_Class {
	
	@Test
	private void checkUserName() {
		
		assertEquals("Raja", "vel");
		
	}
	
	
	@Test
	private void checkPassword() {
		
		assertEquals("Raja", "Raja");
		
	}
	
	@Test
	private void check2() {
		
		assertEquals("123", "321");
	}

}
