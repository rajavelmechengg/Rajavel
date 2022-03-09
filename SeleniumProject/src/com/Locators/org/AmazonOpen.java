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

public class AmazonOpen {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("rajavelmechengg@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("password")).sendKeys("raj......17");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcf = tk.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\amaz.png");
		FileUtils.copyFile(srcf, file);
		
	
		
	}

}
