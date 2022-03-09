package com.Project_Task.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(3000);
		
		
		WebElement dob = driver.findElement(By.xpath("(//select[@name='birthday_day'])"));
		Select s = new Select(dob);
		s.selectByValue("29");
		
		WebElement dom = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(dom);
		s1.selectByIndex(11);
		
		WebElement doyr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(doyr);
		s2.selectByValue("1991");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("RAJ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("VEL");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8870128207");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
	
	}

}
