package com.BaseClass.org;

import javax.lang.model.element.Element;

public class BaseClass1_Execute extends Baseclass1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		getbrowser("chrome");
		geturl("https://www.amazon.in/");
		findelement("(//a[text()='Best Sellers'])[1]");
		element.click();
		Thread.sleep(3000);
		findelement("//a[text()='Most Gifted']");
		element.click();
		
	}
	
	

}
