package com.AllTestNG_Functions;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test (groups = "Favorite Wishlist")
	private void smartWatch() {
System.out.println("Smart Watch");
	}
	
	@Test(groups = "Favorite Wishlist")
	private void cycle() {
System.out.println("Cycle");
	}
	
	@Test	(groups = "Favorite Wishlist")
	private void asusMobile() {
System.out.println("Asus Mobile");
	}
	
	@Test (groups = "HouseHold Item")
	private void tv() {
System.out.println("TV");
	}
	
	@Test(groups = "Office Wishlist")
	private void pendrive() {
System.out.println("Pendrive");
	}
	
	@Test(groups = "Office Wishlist")
	private void hardDisk() {
System.out.println("HardDisk");
	}
	
	@Test(groups = "Office Wishlist")
	private void laptop() {
System.out.println("Laptop");
	}
	
	@Test(groups = "HouseHold Item")
	private void washingMachine() {
System.out.println("Washing Machine");
	}
	
	@Test(groups = "Office Wishlist")
	private void zebronics_Speakers() {
System.out.println("Zebronic Speakers");
	}
}


