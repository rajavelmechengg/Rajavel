package com.Locators.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintry {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tnebnet.org/awp/login?locale=ta");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("8870128207");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		WebElement text = driver.findElement(By.xpath("//span[@title='Click here']"));
		
		System.out.println(text.getText());
		
		WebElement txt = driver.findElement(By.xpath("//span[contains(text(),'For TANGEDCO ')]"));
		
		System.out.println(txt.getText());
		
		driver.findElement(By.partialLinkText("bharatbillpay")).click();
		
		driver.findElement(By.linkText("Bill Pay")).click();
		
		Thread.sleep(2000);
		
		TakesScreenshot tt = (TakesScreenshot) driver;
		File srf = tt.getScreenshotAs(OutputType.FILE);
		File fl = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\tneb.png");
		FileUtils.copyFile(srf, fl);
		
	}

}
