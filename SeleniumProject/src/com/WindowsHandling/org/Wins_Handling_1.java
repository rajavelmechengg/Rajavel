package com.WindowsHandling.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.org.BaseClass;

public class Wins_Handling_1  {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement bestseller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions a = new Actions(driver);
		a.contextClick(bestseller).perform();
	//	Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		WebElement mobile = driver.findElement(By.xpath("(//a[text()='Mobiles'])"));
		a.contextClick(mobile).perform();
	//	Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	
		
		WebElement deal  = driver.findElement(By.xpath("//a[text()='Mobiles']//following::a[1]"));
		a.contextClick(deal).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(".............o/p............");
		
	
		
		/*	
		String mainwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println("Number of Windows: "+allwin.size());
		for (String id : allwin) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			driver.close();	*/
	/*	
		Iterator<String> title = allwin.iterator();
		String mainwin1 = title.next();
		String window1 = title.next();
		String window2 = title.next();
		String window3 = title.next();
		
		String title2 = driver.switchTo().window(window1).getTitle();
		System.out.println(title2);
		driver.close();
		
		String title3 = driver.switchTo().window(window2).getTitle();
		System.out.println(title3);	
		driver.close();
		
		String title4 = driver.switchTo().window(window3).getTitle();
		System.out.println(title4);
		driver.close();
		
		String title5 = driver.switchTo().window(mainwin1).getTitle();
		System.out.println(title5);
		driver.close();
		*/
		}
		
		
		
		
		
	}


