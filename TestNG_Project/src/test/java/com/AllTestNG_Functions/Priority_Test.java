package com.AllTestNG_Functions;


import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test
	private void smartWatch() {
System.out.println("Smart Watch");
	}
	
	@Test(priority = 3)
	private void cycle() {
System.out.println("Cycle");
	}
	
	@Test		(priority = 5)
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
	
	@Test(priority = -3)
	private void hardDisk() {
System.out.println("HardDisk");
	}
	
	@Test (priority = -2)
	private void laptop() {
System.out.println("Laptop");
	}
	
	@Test(priority = 0)
	private void wallet() {
System.out.println("Wallet");
	}
	
	@Test(priority = -1)
	private void zebronics_Speakers() {
System.out.println("Zebronic Speakers");
	}
}


