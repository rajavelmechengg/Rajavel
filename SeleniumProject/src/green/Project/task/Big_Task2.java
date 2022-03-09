package green.Project.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Big_Task2 {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])"));
		search.sendKeys("automation practice");
		search.submit();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajavelmechengg@gmail.com");
		driver.findElement(By.xpath("(//input[@id='passwd'])")).sendKeys("raja8870128207");
		driver.findElement(By.xpath("(//i[@class='icon-lock left'])")).click();
		Thread.sleep(2000);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		ac.moveToElement(tshirt).perform();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",tshirt);
		
		WebElement img = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		ac.moveToElement(img).perform();
		
		driver.findElement(By.xpath("(//a[@id='color_2'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File fl = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\pro1.png");
		FileUtils.copyFile(src, fl);
		
		driver.findElement(By.xpath("(//span[text()='(order processing will be longer)'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		File src1 = tk.getScreenshotAs(OutputType.FILE);
		File fl2 = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\pay.png");
		FileUtils.copyFile(src1, fl2);
		
		
	}

}
