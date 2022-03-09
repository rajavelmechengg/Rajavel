package com.Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	/*	WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search']"));	
		JavascriptExecutor js = (JavascriptExecutor) driver;							  // method - 1
		js.executeScript("arguments[0].setAttribute('value','amazon')",searchbox);
		js.executeScript("arguments[0].click()", searchbox);
	*/	
		
	/*	WebElement searchbox1 = driver.findElement(By.xpath("//input[@title='Search']"));
		searchbox1.sendKeys("amazon");													 //	method - 2
		searchbox1.submit();
	*/	
		
		WebElement searchbox2 = driver.findElement(By.xpath("//input[@title='Search']"));
		searchbox2.sendKeys("amazon");
		JavascriptExecutor js = (JavascriptExecutor) driver;								
	//	js.executeScript("arguments[0].setAttribute('value','amazon')",searchbox2);		 //	method - 3
		js.executeScript("arguments[0].click()",searchbox2);
		
	}
	

}
