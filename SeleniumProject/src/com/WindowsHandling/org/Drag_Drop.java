package com.WindowsHandling.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_Drop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	//	driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
		driver.findElement(By.xpath("//a[text()='Proceed to demoqa.com (unsafe)']")).click();
		driver.findElement(By.xpath("//h5[text()='Interactions']")).click();
		
		
		driver.findElement(By.xpath("(//a[@class ='gb_d'])[1]")).click();
	}

}
