package com.SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://translate.google.co.in/?sl=en&tl=es&op=translate");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com/imghp?hl=en");
	//	driver.navigate().back();
	//	Thread.sleep(2000);
	//	driver.navigate().forward();
	//	Thread.sleep(2000);
	
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		
		File srcf = tk.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\image.png");
		
		FileUtils.copyFile(srcf, file);
		
		
		
		
		
		
		
		
		
		
	}

}
