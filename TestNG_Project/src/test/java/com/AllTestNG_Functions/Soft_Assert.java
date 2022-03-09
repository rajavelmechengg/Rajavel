package com.AllTestNG_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	private void softAssertFun() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\TestNG_Project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	String expectedTitle = "  institutes in Chennai with Placements | Greens Technologys";
	System.out.println(" Best Software Training institutes in Chennai with Placements | Greens Technologys");
	
			SoftAssert s = new SoftAssert();
			s.assertEquals(actualTitle, expectedTitle);
			
	driver.navigate().to("https://www.instagram.com/");
	
	}	//Eventhough Expected and Actual results are not match it will not stop the execution

}
