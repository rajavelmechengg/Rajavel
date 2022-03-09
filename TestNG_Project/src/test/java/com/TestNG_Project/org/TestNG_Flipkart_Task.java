package com.TestNG_Project.org;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Flipkart_Task {

	public static WebDriver driver;
	public static String url = "https://www.flipkart.com/";

	@BeforeSuite
	private void setProperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raja\\eclipse-workspace\\Maven_TestNG_Project\\Drivers\\chromedriver.exe");
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
	private void userenter() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Login']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rajavelmechengg@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("raja9944532517");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println("...........BeforeClass Completed..............................");
	}

	@BeforeMethod
	private void userRefresh() throws InterruptedException {
		driver.navigate().refresh();
		System.out.println("...................BeforeMethod Completed................");
	}

	@Test
	private void mobileSearch() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox1 = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox1.clear();
		searchBox1.sendKeys("Samsung S21 Ultra");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("........Test-1 ...Mobile Search...............");
	}

	@Test
	private void laptopSearch() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Mackbook Pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-2...Laptop Search...............");
	}

	@Test
	private void smartWatch() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Apple Watch 7");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-3...SmartWatch Search...............");

	}

	@Test
	private void electricCycle() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Hero Lectro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-4...ElectricCycle Search...............");

	}

	@Test
	private void television() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Samsung 75inch series 8 tv");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-5...ElectricCycle Search...............");

	}

	@Test
	private void soundBar() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("JBL bar 9.1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-6...Sound Bar Search...............");
	}

	@Test
	private void vaccumCleaner() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Vaaccum Cleaner");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-7...Vaccum Cleaner Search...............");
	}

	@Test
	private void earPhone() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Apple airpods max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-8...Ear Phone Search...............");
	}

	@Test
	private void sportShoes() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Nike Sports Shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-9...Sport Shoes Search...............");

	}

	@Test
	private void airConditioner() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("(//input[@type='text'])"));
		searchBox.clear();
		searchBox.sendKeys("Daikin 2 ton spilit AC ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(".........Test-10...Air Conditioner Search...............");
	}
	
	@AfterMethod
	private void userrefreshed() {
	//	driver.navigate().refresh();
		System.out.println("...........AfterMethod Completed..............................");
		
	}
	
	@AfterClass
	private void logOut() {
		 driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]")).click();
	//	Actions ac = new Actions(driver);
	//	ac.moveToElement(rajaout);
		 System.out.println("...........AfterClass Completed..............................");
	}
	
	@AfterTest
	private void deleteCookie() {
		driver.manage().deleteAllCookies();
		System.out.println("...........AfterClass Completed......(Delete Cookies........................");
	}
	
	@AfterSuite
	private void close() {
		driver.close();
		System.out.println("...........AfterSuite Completed..(Closed)............................");
	}
	

}
