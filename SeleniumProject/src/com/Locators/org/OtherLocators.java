package com.Locators.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLocators {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		Thread.sleep(3000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File sr = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\sc3.png");
		FileUtils.copyFile(sr, f);
		
		driver.findElement(By.className("DVPAWebWidgetsCustomComponents_Image__image")).click();
		
		Thread.sleep(3000);
		
		File sr1 = t.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\sc4.png");
		FileUtils.copyFile(sr1, f2);
	}

}
