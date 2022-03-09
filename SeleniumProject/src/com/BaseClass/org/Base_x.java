package com.BaseClass.org;

import java.awt.AWTException;
import java.io.IOException;

public class Base_x  extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		openbrowser("chrome");
		openurl("http://demo.automationtesting.in/Alerts.html");
		findelement("xpath", "//button[@class='btn btn-danger']");
		clickbutton("xpath");
		Thread.sleep(500);
		alerts("accept");
		findelement("xpath", "(//a[@class='analystic'])[3]");
		clickbutton("xpath");
		findelement("xpath", "(//button[@class='btn btn-info'])");
		clickbutton("xpath");
		alerts("accept");
		sendkey("xpath", "Rajavel");
		clickbutton("xpath");
		alerts("accept");
		navigateto("http://demo.automationtesting.in/Register.html");
		findelement("xpath", "(//a[@class='dropdown-toggle'])[7]");
		mousehover(elementxpath);
		robot(6);
		navigateto("http://www.greenstechnologys.com/");
		navigateback();
		navigateforward();
		navigaterefresh();
		scrollby();
		findelement("xpath", "//img[@alt='DMCA.com Protection Status']");
		scrollupdown(elementxpath);
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\pic6.png");
		navigateto("https://www.facebook.com/r.php?locale=en_GB&display=page");
		findelement("xpath", "//select[@id='day']");
		dropdown("xpath", "value", "29", 0);
		findelement("xpath", "//select[@id='month']");
		dropdown("xpath", "index", null, 11);
		getoption();
		isdisplayed();
		System.out.println("............is displayed............");
		isenabled();
		System.out.println("............is enabled............");
		isselected();
		System.out.println("............is selected............");
		findelement("xpath", "//select[@id='year']");
		dropdown("xpath", "value", "1991", 0);
		ismultible();
		findelement("xpath", "//label[text()='Male']");
		clickbutton("xpath");
		navigateto("https://www.amazon.in/");
		findelement("xpath", "(//a[text()='Best Sellers'])[1]");
		mouserightclick(elementxpath);
		robot(1);
		findelement("xpath", "(//a[text()='Mobiles'])");
		mouserightclick(elementxpath);
		robot(1);
		findelement("xpath", "//a[text()='Mobiles']//following::a[1]");
		mouserightclick(elementxpath);
		robot(1);
		windowhandle();	
		
		
	}
	
	

}
