package com.Alert_Task.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.org.BaseClassMain;

public class Alert_Task1 extends BaseClassMain {
	public static void main(String[] args) throws InterruptedException {
		
		getbrowser("chrome");
		geturl("http://demo.automationtesting.in/Alerts.html");
		findelementXp("//button[@class='btn btn-danger']").click();
		alerts("accept");
		
		
		
	/*	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@title='Search']"));
		textbox.sendKeys("alert automation practice");
		textbox.submit();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		
		WebElement simplealert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simplealert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmalert.click();
		driver.findElement(By.xpath("(//button[@onclick='confirmbox()'])")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])")).click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Rajavel");
		Thread.sleep(3000);
		prompt.accept();
		
	*/
		
	}

}
