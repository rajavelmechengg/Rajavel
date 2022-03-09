package com.BaseClass.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class BaseClassMain {
	public static WebDriver driver;
	public static WebElement element, elementxp, elementid, elementname;
	public static WebDriverWait webDriverWait;
	public static Alert a;
	public static Select s;

	public static WebDriver getbrowser(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Raja\\eclipse-workspace\\Cucumber_Project\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Raja\\eclipse-workspace\\Cucumber_Project\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();

			} else {
				System.out.println("Invalid Browser Name");
			}

			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitImplicit() {

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitExplicit() {

	}

	public static void waitFluent() {

		try {
			FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(3)).ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebElement findelementXp(String xpath) {

		try {
			elementxp = driver.findElement(By.xpath(xpath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return elementxp;
	}
	

	public static void findelementId(String id) {
		try {
			elementid = driver.findElement(By.id(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findelementName(String name) {
		try {
			elementname = driver.findElement(By.id(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendkey(WebElement element, String key) {

		try {
			element.sendKeys(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendkeyXp(String txt) {

		try {
			elementxp.sendKeys(txt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendkeyId(String txt) {

		try {
			elementid.sendKeys(txt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendkeyName(String txt) {

		try {
			elementname.sendKeys(txt);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void screenshot(String path) throws IOException {

		try {
			TakesScreenshot js = (TakesScreenshot) driver;
			File src = js.getScreenshotAs(OutputType.FILE);
			File fl = new File(path);
			FileUtils.copyFile(src, fl);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void scrollUp(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropdown(WebElement element, String txt, String keys) {

		try {
			Select s = new Select(element);
			if (txt.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(keys);
				s.selectByIndex(parseInt);

			} else if (txt.equalsIgnoreCase("Value")) {
				s.selectByValue(keys);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
	
	public static void navigateto(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void navigateback() {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void navigateforward() {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void navigaterefresh() {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void alerts(String value) {

		try {
			a = driver.switchTo().alert();

			if (value.equalsIgnoreCase("accept")) {
				a.accept();
			} else if (value.equalsIgnoreCase("dismiss")) {
				a.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void mouserightclick(WebElement web) {

		try {
			Actions ac = new Actions(driver);
			ac.contextClick(web).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void mousehover(WebElement web) {

		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(web).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void robot(int a) throws AWTException {

		try {
			Robot r = new Robot();
			for (int i = 0; i < a; i++) {

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void currenturl() {

		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current url is:  " + currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void gettitle() {

		try {
			String title = driver.getTitle();
			System.out.println("Current title is: " + title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static  void gettext(String value) {
		
		try {
			if (value.equalsIgnoreCase("id")) {
				String text = elementid.getText();
				System.out.println(text);
				
			}else if (value.equalsIgnoreCase("name")) {
				String text = elementname.getText();
				System.out.println(text);
				
			}else if (value.equalsIgnoreCase("xpath")) {
				String text = elementxp.getText();
				System.out.println(text);
			}else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static void scrollby() {
	
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
public static void fram(String xpath) {
	try {
		driver.switchTo().frame(driver.findElement(By.xpath(xpath)));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
//	if (Value.equalsIgnoreCase("String")) {
//		driver.switchTo().frame(keys);
//	}else if (Value.equalsIgnoreCase("elementxp")) {
//		driver.switchTo().frame(elementxp);
//	}
//	
		
	}

	
public static void getoption() {
	
	try {
		List<WebElement> options = s.getOptions();
		for (WebElement multidr : options) {
			System.out.println(multidr.getText());
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void windowhandle() {
	try {
		Set<String> handles = driver.getWindowHandles();
		for (String st : handles) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
			driver.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public static  void clear() {
	
	try {
		elementxp.clear();
	} catch (Exception e) {
		e.printStackTrace();
	}

}

public static void isenabled() {
	
	try {
		elementxp.isEnabled();
	} catch (Exception e) {
		e.printStackTrace();
	}

}

public static void isdisplayed() {
	
	try {
		elementxp.isDisplayed();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void isselected() {
	
	try {
		elementxp.isSelected();
	} catch (Exception e) {
		e.printStackTrace();
	}

}

	public static void closetab() {

		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void quittab() {

		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}

