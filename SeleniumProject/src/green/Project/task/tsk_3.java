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

public class tsk_3 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		WebElement down = driver.findElement(By.xpath("//b[text()=' Recent Job Openings here ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		Object file = js.executeScript("arguments[0].scrollIntoView();",down);
		
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File sr = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\x2.png");
		FileUtils.copyFile(sr, f);
		
		WebElement up = driver.findElement(By.xpath("//a[text()='HOME']"));
		js.executeAsyncScript("arguments[0].scrollIntoView();",up);
		
	//	Thread.sleep(2000);
		
		js.executeAsyncScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeAsyncScript("window.scrollBy(0,-2000)");
		
		
		
	}

}
