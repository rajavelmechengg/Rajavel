package green.Project.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Big_Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])"));
		search.sendKeys("automation practice");
		search.submit();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='email_create'])")).sendKeys("rajavelmechengg@gmail.com");
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='customer_firstname'])")).sendKeys("Rajavel");
		driver.findElement(By.xpath("(//input[@name='customer_lastname'])")).sendKeys("G");
		driver.findElement(By.xpath("(//input[@name='passwd'])")).sendKeys("raja8870128207");
		WebElement day = driver.findElement(By.xpath("(//select[@id='days'])"));
		Select s = new Select(day);
		s.selectByValue("29");
		WebElement month = driver.findElement(By.xpath("(//select[@id='months'])"));
		Select s1 = new Select(month);
		s1.selectByIndex(12);
		//s1.selectByValue("December");
		WebElement yr = driver.findElement(By.xpath("(//select[@id='years'])"));
		Select s2 = new Select(yr);
		s2.selectByValue("1991");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='firstname'])")).sendKeys("Rajavel");
		driver.findElement(By.xpath("(//input[@id='lastname'])")).sendKeys("G");
		driver.findElement(By.xpath("(//input[@id='company'])")).sendKeys("Ganesan");
		driver.findElement(By.xpath("(//input[@id='address1'])")).sendKeys("texas street");
		driver.findElement(By.xpath("(//input[@id='address2'])")).sendKeys("allen street north");
		driver.findElement(By.xpath("(//input[@id='city'])")).sendKeys("Houston");
		WebElement city = driver.findElement(By.xpath("(//select[@id='id_state'])"));
		Select sta = new Select(city);
		sta.selectByIndex(12);
		//sta.selectByValue("Texas");
		driver.findElement(By.xpath("(//input[@id='postcode'])")).sendKeys("77001");
		driver.findElement(By.xpath("(//input[@id='phone_mobile'])")).sendKeys("7766554433");
		driver.findElement(By.xpath("(//input[@id='alias'])")).sendKeys("alias");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
