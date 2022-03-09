package com.AllTestNG_Functions;

import org.testng.annotations.Test;

public class TimeOut {
	
	
	@Test (timeOut = 2500)
	private void watch() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Smart Watch");
	}
	
	@Test (timeOut = 3000)
	private void earPhone() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Ear Phone");
	}

}
