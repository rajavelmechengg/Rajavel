package com.Locators.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocator {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rajavelmechengg@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("..................");
		
		WebElement cli = driver.findElement(By.name("login"));
		cli.click();
		
		
	}

}
