package CompayName_Maven.Specific_Proj_Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Task1 {
public static WebDriver driver;
	
	@BeforeSuite
	private void setprop() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\Maven_Proj_Name\\Drivers\\chromedriver.exe");

	}
	
	@BeforeTest
	private void Browserlaunch() {
		 driver = new ChromeDriver();
	}
	
	@BeforeClass
	private void OpenUrl() {
		driver.get("https://adactinhotelapp.com/");
	}
	
	@BeforeMethod
	private void login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("RAJAVELGANESAN");
		driver.findElement(By.id("password")).sendKeys("raja9944532517");
		driver.findElement(By.id("login")).click();
	}
	
	@Test
	private void searchHotel() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(2);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomType);
		s2.selectByIndex(2);
		
		WebElement nosrooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(nosrooms);
		s3.selectByIndex(2);
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("05/02/2022");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("10/02/2022");
		
		WebElement adultnos = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultnos);
		s4.selectByIndex(1);
		
		WebElement childnos = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childnos);
		s5.selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		
	}
	
	@AfterClass
	private void logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
/*	@AfterTest
	private void close() {
		driver.close();
	}
*/	
	@AfterSuite
	private void deletecookies() {
		driver.manage().deleteAllCookies();
	}
	

}



