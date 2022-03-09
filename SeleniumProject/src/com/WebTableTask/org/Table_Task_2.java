package com.WebTableTask.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Task_2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://nusrlranchi.in/ipl-2022-schedule-date-time-table-points-table-channel/");
	
//	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	
	List<WebElement> parlist = driver.findElements(By.xpath("(//table[@class='table'])[4]/tbody/tr/td[3]"));
	for (WebElement data : parlist) {
		System.out.println(data.getText());
	}
	
	
	
	
}
}
