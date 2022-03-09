package green.Project.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsk_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("123456");
		
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		

	}

}
