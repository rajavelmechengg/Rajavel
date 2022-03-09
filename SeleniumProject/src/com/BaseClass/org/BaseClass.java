																																							package com.BaseClass.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

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
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement elementid, elementname, elementxpath;
	public static Alert a;
	public static Select s; 

	public static WebDriver openbrowser(String choosebrowser) {
		try {
			if (choosebrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (choosebrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid Browser");
			}

			//driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	} 

	public static void openurl(String url) {

		try {
			driver.get(url);
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

	public static void findelement(String option, String txt) {

		try {
			if (option.equalsIgnoreCase("id")) {
				elementid = driver.findElement(By.id(txt));
				
				
			} else if (option.equalsIgnoreCase("name")) {
				elementname = driver.findElement(By.name(txt));

			} else if (option.equalsIgnoreCase("xpath")) {
				elementxpath = driver.findElement(By.xpath(txt));
			} else {
				System.out.println("Invalid ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendkey(String value, String txt) {

		try {
			if (value.equalsIgnoreCase("id")) {
				elementid.sendKeys(txt);
			} else if (value.equalsIgnoreCase("name")) {
				elementname.sendKeys(txt);
			} else if (value.equalsIgnoreCase("xpath")) {
				elementxpath.sendKeys(txt);
			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void minimizewin() {

		try {
			driver.manage().window().minimize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickbutton(String value) {

		try {
			if (value.equalsIgnoreCase("id")) {
				elementid.click();
			} else if (value.equalsIgnoreCase("name")) {
				elementname.click();
			} else if (value.equalsIgnoreCase("xpath")) {
				elementxpath.click();
			} else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenshot(String path) throws IOException {

		try {
			TakesScreenshot tak = (TakesScreenshot) driver;
			File srcfl = tak.getScreenshotAs(OutputType.FILE);
			File file = new File(path);
			FileUtils.copyFile(srcfl, file);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
				String text = elementxpath.getText();
				System.out.println(text);
			}else {
				System.out.println("Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scrollupdown(Object element) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
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
	
	public static void fram(WebElement elementxpath) {
		
		try {
			
		//	WebElement findElement = driver.findElement(By.xpath(xpth));
		//	driver.switchTo().frame(findElement);
			
			driver.switchTo().frame(elementxpath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dropdown(String value,String txt, String keys, int x) {
		
		try {
			if (value.equalsIgnoreCase("xpath")) {
				 s = new Select(elementxpath);
				 
				if (txt.equalsIgnoreCase("value")) {
					s.selectByValue(keys);
					
				}else if (txt.equalsIgnoreCase("index")) {
					s.selectByIndex(x);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ismultible() {
		
		try {
			
			boolean multiple = s.isMultiple();
			System.out.println("Is Multiple Drop Down: "+multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}

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
			elementxpath.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void isenabled() {
		
		try {
			elementxpath.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void isdisplayed() {
		
		try {
			elementxpath.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void isselected() {
		
		try {
			elementxpath.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	

}
