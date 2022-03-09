package com.SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2Selenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		String cu = driver.getCurrentUrl();
		System.out.println("Current page url: "+cu);
		
		String title = driver.getTitle();
		System.out.println("Current page tile: "+title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
