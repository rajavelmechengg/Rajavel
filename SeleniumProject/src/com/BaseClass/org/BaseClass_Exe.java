package com.BaseClass.org;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.idealized.OpaqueKey;

public class BaseClass_Exe  extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		openbrowser("chrome");
		openurl("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		findelement("xpath","(//input[@type='text'])[1]" );
		sendkey("xpath","Raja");
		navigateto("http://www.greenstechnologys.com/");;
		findelement("xpath", "//img[@alt='DMCA.com Protection Status']");
		scrollupdown(elementxpath);
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\pic1.png");
		findelement("xpath", "//img[@alt='Greens Technologys - Leaders in IT training and Placement']");
		Thread.sleep(1000);
		scrollupdown(elementxpath);
		navigateto("https://www.google.co.in/");
		findelement("xpath", "//a[text()='Gmail']");
		mouserightclick(elementxpath);
		robot(3);
	}

}
