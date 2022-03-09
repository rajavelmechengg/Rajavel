package com.MouseHover.org;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		ac.moveToElement(tshirt).perform();
		
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",tshirt);
	
		
	/*	WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		tshirt.click();
	*/	
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		ac.moveToElement(img).perform();
		driver.findElement(By.xpath("(//a[@id='color_2'])")).click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		
		
	}

}
