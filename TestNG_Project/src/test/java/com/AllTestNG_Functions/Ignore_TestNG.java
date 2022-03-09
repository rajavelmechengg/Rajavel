package com.AllTestNG_Functions;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_TestNG {
	
	@Test
	private void smartWatch() {
System.out.println("Smart Watch");
	}
	
	@Ignore			//Ignore Test Method	
	@Test
	private void cycle() {
System.out.println("Cycle");
	}
	
	@Test(enabled = false)		//Ingore Test Method (Another Way of Ingnore)
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
	
	@Ignore
	@Test
	private void hardDisk() {
System.out.println("HardDisk");
	}
	
	@Test
	private void laptop() {
System.out.println("Laptop");
	}
	
	@Test
	private void wallet() {
System.out.println("Wallet");
	}
	
	@Test
	private void zebronics_Speakers() {
System.out.println("Zebronic Speakers");
	}
}



