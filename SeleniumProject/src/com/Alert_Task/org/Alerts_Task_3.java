package com.Alert_Task.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Task_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		Thread.sleep(6000);
		//driver.findElement(By.xpath("(//button[@class='tntOverlayCloseBtn'])")).click();
	//	driver.switchTo().alert().accept(); //it is not a alert
		
		
		
		
		
		
		
		
		
		
	}

}
