package com.Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.org.Baseclass1;

			// Success Program

public class Javascriptexe_Up_Down extends Baseclass1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement down = driver.findElement(By.xpath("//img[@alt='DMCA.com Protection Status']"));
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", down);
		
		Thread.sleep(3000);
		
		WebElement up = driver.findElement(By.xpath("//a[@class='activeLink']"));
		js.executeScript("arguments[0].scrollIntoView();",up);
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)");
		
	}

}
         