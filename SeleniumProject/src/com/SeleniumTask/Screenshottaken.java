package com.SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshottaken {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		driver.manage().window().maximize();
		
	    TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\twitnew2.png");
		FileUtils.copyFile(srcfile, destinationfile);
		Thread.sleep(5000);
	
		driver.navigate().to("https://www.instagram.com/");
		TakesScreenshot secondshot = (TakesScreenshot) driver;
		File src2 = secondshot.getScreenshotAs(OutputType.FILE);
		File deFile = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\twitterscnew2.png");
		FileUtils.copyFile(src2, deFile);
		driver.quit();
		
		
		
		
	}
}
	