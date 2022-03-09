package com.WebTableTask.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freejobalert.com/state-government-jobs/");
		
		List<WebElement> tabledata = driver.findElements(By.xpath("(//table[@class='lattbl'])[5]/tbody/tr/td"));
		for (WebElement data : tabledata) {
			System.out.println(data.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	 
}
