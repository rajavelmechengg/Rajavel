package com.Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Up_DownConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		WebElement down = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",down);
		
		Thread.sleep(3000);
		
		WebElement up = driver.findElement(By.xpath("//a[text()='Shop']"));
		js.executeScript("arguments[0].scrollIntoView();", up);
		
	}

}
