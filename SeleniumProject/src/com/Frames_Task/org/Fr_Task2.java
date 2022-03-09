package com.Frames_Task.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.org.BaseClassMain;

public class Fr_Task2 extends BaseClassMain{
	public static void main(String[] args) {
		
		getbrowser("chrome");
		geturl("http://demo.automationtesting.in/Frames.html");
		fram("//iframe[@style='float: left;height: 300px;width: 600px']");
		findelementXp("(//input[@type='text'])[1]");
		sendkey(elementxp, "rajag");
		
		/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
	
	
		WebElement singlefr = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
		driver.switchTo().frame(singlefr);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Rajavel");
		System.out.println("..................Single Frame Page.......................");
		
		driver.switchTo().defaultContent(); // Now it comes Out of the frames.
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		System.out.println("...................Multible Frames Page........................");
		
		WebElement outterfr = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(outterfr);
		System.out.println("........................Outter Frame............................");
		
		WebElement innerfr = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerfr);
		System.out.println("............................Inner Frame...........................");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Rajavel Ganesan");
		System.out.println(".......................Name Entered.........................");
		
		List<WebElement> frcount = driver.findElements(By.tagName("iframe"));
		System.out.println("1.Current Frame Count: "+frcount.size());
		
		driver.switchTo().parentFrame();		// it come out parent frame only
		
		List<WebElement> frcount1 = driver.findElements(By.tagName("iframe"));
		System.out.println("2.Current Frame Count: "+frcount1.size());
		
		driver.switchTo().defaultContent();		// it comes out entire frames
		
		List<WebElement> frcount2 = driver.findElements(By.tagName("iframe"));
		System.out.println("3.Current Frame Count: "+frcount2.size());
		
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		System.out.println("Total anchor tag Numbers: "+ tag.size());
	*/	
	}
	
	

}
