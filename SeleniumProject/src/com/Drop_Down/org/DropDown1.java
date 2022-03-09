package com.Drop_Down.org;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.org.BaseClass;

public class DropDown1 extends BaseClass{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		
   //    WebDriverWait wait = new WebDriverWait(driver, 10);
   //    wait.until(ExpectedConditions.visibilityOf(elementid));
	
		WebElement multidrop = driver.findElement(By.xpath("(//select[@id='multi-select'])"));
		
		Select s = new Select(multidrop);
		 boolean multiple = s.isMultiple();
		System.out.println("Is the box Multiple DropDown: "+ multiple);
		
		
		
		List<WebElement> list = s.getOptions();
		for (WebElement multi : list) {
			System.out.println(multi.getText());	
		}
		
		s.selectByIndex(2);
		s.selectByIndex(4);
		
	}

}
