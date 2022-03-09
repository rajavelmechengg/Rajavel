package com.SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(3000);
		TakesScreenshot tkk = (TakesScreenshot) driver;
		File srfl = tkk.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\wtsapp.png");
		FileUtils.copyFile(srfl, file);
		driver.quit();
		
	}

}
