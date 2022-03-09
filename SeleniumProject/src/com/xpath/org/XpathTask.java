package com.xpath.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!260704327909!p!!g!!flipkart%20login&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_eta_mobile_goog&gclid=EAIaIQobChMIh_CW74CG9QIVkTArCh1fWg_kEAAYASAAEgKigvD_BwE");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8870128207");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ra.........17");
		
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File src = t1.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\flipkart.png");
		FileUtils.copyFile(src, file);
	}

}
