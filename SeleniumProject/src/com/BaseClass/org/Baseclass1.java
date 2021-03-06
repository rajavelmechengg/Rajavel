package com.BaseClass.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass1 {
	
	public static WebDriver driver;
	public static WebElement element;
	
	public static WebDriver getbrowser(String browsername ) {
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
				 driver = new ChromeDriver();
				
				
			}else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\msedgedriver.exe");
				 driver = new EdgeDriver();
				
				
			}else {
				System.out.println("Invalid Browser Name");
			}
			
		//	driver.manage().window().maximize();
			
	//	WebDriverWait wt = new WebDriverWait(driver, 10);
	//		wt.until(ExpectedConditions.visibilityOf(null));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	public static void findelement(String xpath) {

		 element = driver.findElement(By.xpath(xpath));
	}
	
	public static  void find() {
	element.click();

	}
	
	
	
	
	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void screenshot(String path) throws IOException {

		try {
			TakesScreenshot js = (TakesScreenshot) driver;
			File src = js.getScreenshotAs(OutputType.FILE);
			File fl = new File(path);
			FileUtils.copyFile(src, fl);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void scrollUp(WebElement element) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sendkey(WebElement element, String key) {
		
		try {
			element.sendKeys(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dropdown(WebElement element, String txt , String keys ) {
		
		try {
			Select s = new Select(element);
			if (txt.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(keys);
				s.selectByIndex(parseInt);
				
			}else if (txt.equalsIgnoreCase("Value")) {
				s.selectByValue(keys);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		

	}
	
	
	
	
	}

