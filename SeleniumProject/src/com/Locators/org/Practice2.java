package com.Locators.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signin");
		
		
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rajavel.............g@gmail.com");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("ra..................17");
		
		WebElement ck = driver.findElement(By.className("btn btn-primary signin user"));
		ck.click(); 
	
	}

}
