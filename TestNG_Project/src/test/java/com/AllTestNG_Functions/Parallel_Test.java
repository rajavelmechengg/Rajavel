package com.AllTestNG_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	
	@Test
	private void flipkartShoping() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	private void amazonShoping() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	private void myntra() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

	}
	
	

}
