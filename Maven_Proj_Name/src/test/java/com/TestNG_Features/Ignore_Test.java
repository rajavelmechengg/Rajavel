package com.TestNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {

	@Test
	private void smartWatch() {
System.out.println("Smart Watch");
	}
	
	@Ignore				
	@Test
	private void cycle() {
System.out.println("Cycle");
	}
	
	@Test(enabled = false)		
	private void asusMobile() {
System.out.println("Asus Mobile");
	}
	
	@Test
	private void tv() {
System.out.println("TV");
	}
	
	@Test
	private void pendrive() {
System.out.println("Pendrive");
	}

}
