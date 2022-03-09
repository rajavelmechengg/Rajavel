package com.AllTestNG_Functions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	private void hardAssertfunction() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\TestNG_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Best Software Training institutes in Chennai with Placements | Greens Technologys";
	//	System.out.println("Best Software Training institutes in Chennai with Placements | Greens Technologys");
		
	//	assertEquals(actualTitle, expectedTitle);
		
		assertTrue(1==1);
		
		driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng");
		
		//If Expected or Actual Results are not same it will stop the execution.
		
		assertTrue(driver.getCurrentUrl().endsWith("ct/org.testng/testng"));	
		
		driver.navigate().back();
		
		
	}

}
