package com.SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Opennewbrowser {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Drivers new\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=547698306402714393&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061971&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIssnBsbf59AIVNdWWCh2TswEJEAAYASAAEgL1uPD_BwE");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Page Site Url:  "+ currentUrl);
		
		String title = driver.getTitle();
		System.out.println("Current page site name:  "+title);
		
	//	String pageSource = driver.getPageSource();
	//	System.out.println("Current PageSource is:  "+pageSource);
		
		
		
		
	
		
	}

}
