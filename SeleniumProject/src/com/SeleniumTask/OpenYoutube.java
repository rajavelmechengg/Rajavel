package com.SeleniumTask;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYoutube {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		
		File src3 = tk.getScreenshotAs(OutputType.FILE);
		
		File fl = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\yt.png");
		
		FileUtils.copyFile(src3, fl);
		
		
		
		
		
	}

}
