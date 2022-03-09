package com.AllTestNG_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Cross_Browser_Test {
	
	@Test
	private void chrome_Amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}
	@Test
	private void edgeBrowser_Amazon() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
