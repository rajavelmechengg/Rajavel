package com.Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Up_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=18317105580133641446&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061972&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIlav-3NeG9QIVgn0rCh2m0AmtEAAYASAAEgJQVfD_BwE");
		driver.manage().window().maximize();		
		
		WebElement down = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].scrollIntoView();",down);
		
		Thread.sleep(2000);
		
		WebElement up = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
		jse.executeScript("arguments[0].scrollIntoView();",up);
		
		
	}
}
