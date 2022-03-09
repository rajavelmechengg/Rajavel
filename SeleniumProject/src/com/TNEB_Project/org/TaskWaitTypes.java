package com.TNEB_Project.org;

import java.util.concurrent.TimeUnit;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskWaitTypes {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("tangedco login");
		textbox.submit();
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		Actions ac = new Actions(driver);
		ac.click(link).perform();
		
	//	driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.visibilityOf(link));
		
	/*	Wait wait1 = new FluentWait(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.p
		*/		
		Thread.sleep(2000);
		
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		
		WebElement reglink = driver.findElement(By.xpath("//a[text()=' with registration']"));
		ac.click(reglink).perform();
		Thread.sleep(3000);
		driver.get("https://www.tnebnet.org/awp/login");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ganesanrajavel");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("raja9944532517");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@style='border: 0'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-icon ui-icon-circle-check'])[1]")).click();
		
		WebElement down = driver.findElement(By.xpath("//span[text()='© 2013 TANGEDCO. ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
	//	js.executeScript("arguments[0].scrollIntoView();",down);
		
		
		
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
	}

}
