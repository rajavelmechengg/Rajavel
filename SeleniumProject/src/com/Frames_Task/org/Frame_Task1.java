package com.Frames_Task.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.org.BaseClass;

public class Frame_Task1 extends BaseClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		
		
		
		driver.switchTo().frame("singleframe");
		findelement("xpath","(//input[@type='text'])[1]" );
		sendkey("xpath","Raja");
		
		
		/*
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("abc"); 
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		
		
		
		WebElement outerfr = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width:600px'])"));
	
		//fram(outerfr);
		
		
		driver.switchTo().frame(outerfr);
		System.out.println(".............outer fr.................");
		
		WebElement innerfr = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 250px;width: 400px'])"));
		driver.switchTo().frame(innerfr);
		System.out.println("...............inner fr....................");
		
	//	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abcdef");
		
		driver.switchTo().parentFrame();
		System.out.println("................parent fr.............");
		
		 List<WebElement> framecount = driver.findElements(By.tagName("iframe"));
		 System.out.println(framecount.size());
	*/
	}

}
