package com.BaseClass.org;

import java.io.IOException;

import com.SeleniumTask.Screenshot2;

public class BaseClass2 extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		openbrowser("chrome");
		openurl("https://www.facebook.com/r.php?locale=en_GB&display=page");
		findelement("xpath", "//select[@id='day']");
		dropdown("xpath", "value", "29", 0);
		findelement("xpath", "//select[@id='month']");
		dropdown("xpath", "index", null, 11);
		findelement("xpath", "//select[@id='year']");
		dropdown("xpath", "value", "1991", 0);
		ismultible();
		findelement("xpath", "//label[text()='Male']");
		clickbutton("xpath");
		
	
	}
	
	
	

}
