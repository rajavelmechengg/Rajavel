package com.Alert_Task.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
	
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])")).click();
		Thread.sleep(2000);
		a.dismiss();
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])")).click();
		a.sendKeys("Rajavel");
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		
		
	}

}
