package com.SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcf = tk.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\gmail.png");
		FileUtils.copyFile(srcf, file);
		
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
		File src2 = tk.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\fb.png");
		FileUtils.copyFile(src2, file2);
		driver.quit();
		
	}

}
