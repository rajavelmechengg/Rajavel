package com.TestNG_Project.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Amazon {
	
	public static WebDriver driver;
	public static  String url = "https://www.amazon.in/";
	
	@BeforeSuite
	private void setProperty() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		System.out.println("...BeforeSuite Completed..............................");
	}
	
	@BeforeTest
	private void enterApplication() {
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(".......BeforeTest Completed..............................");
	}
	
	@BeforeClass
	private void userEnter() {
		driver.findElement(By.id("nav-link-accountList")).click();
	}
	
	@BeforeMethod
	private void userLogin() {
		driver.findElement(By.id("ap_email")).sendKeys("8870128207");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("raja9944532517");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	@Test
	private void hello() {
System.out.println(".............Test.1...................");
	}
	
	@Test
	private void hai() {
		System.out.println(".............Test.2...................");
			}

	
	@AfterMethod
	private void userLogout() {
		driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	}
	
}
