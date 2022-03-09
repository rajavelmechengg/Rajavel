package com.Drop_Down.org;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.org.BaseClass;
import com.SeleniumTask.OPenBrowser;

public class Drop_Down_Select  extends BaseClass{
	public static void main(String[] args) throws AWTException {
		
		openbrowser("chrome");
		openurl("https://www.amazon.in/");
		findelement("xpath", "(//a[text()='Best Sellers'])[1]");
		mouserightclick(elementxpath);
		robot(1);
		findelement("xpath", "//a[text()='Mobiles']");
		mouserightclick(elementxpath);
		robot(1);
		windowhandle();
		
		
		
		
		
		/*	
		openbrowser("chrome");
		openurl("https://www.facebook.com/r.php?locale=en_GB&display=page");
	
	findelement("xpath", "(//select[@id='day'])");
	
	dropdown("xpath", "value", "29", 0);
	ismultible();
	getoption();
	
		
		WebElement day = driver.findElement(By.xpath("(//select[@id='day'])"));
		
		Select s = new Select(day);
		boolean multiple = s.isMultiple();
		System.out.println("Is Multiple Drop Down: "+ multiple);
		
		*/
		
		
	}

}
