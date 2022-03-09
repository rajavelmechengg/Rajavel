package com.WebTableTask.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Task_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_districts_of_Tamil_Nadu");
		Thread.sleep(2000);
		List<WebElement> table = driver.findElements(By.xpath("(//table[@class='wikitable sortable jquery-tablesorter'])[1]/tbody/tr[12]"));
		for (WebElement data : table) {
			System.out.println(data.getText());
			System.out.println("..............size............");
			System.out.println(data.getSize());
		}
		
		
			
		}
		
		
		
		

}
