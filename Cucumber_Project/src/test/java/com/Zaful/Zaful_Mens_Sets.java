package com.Zaful;

import java.io.IOException;

import com.BaseClass.BaseClass_1;

public class Zaful_Mens_Sets extends BaseClass_1{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		getbrowser("chrome");
		geturl("https://www.zaful.com/?utm_source=shareasale&AffiliateID=3012824&BannerID=677083&sscid=31k6_nug");
		findelementXp("//a[contains(@class,'newuser-coupon-close js-close-newuser-coupon-layer logsss_event_cl')]").click();
		findelementXp("//span[text()='Agree']").click();
		waitImplicit();
		findelementXp("//a[@class='js-topaccount-user account-user-icon logsss_event_cl']").click();
		findelementId("email").sendKeys("rajavelmechengg@gmail.com");
		findelementId("passwordsign").sendKeys("raja9944532517");
		findelementId("js_signInBtn").click();
		Thread.sleep(3000);
		findelementXp("//span[text()='Men']").click();
		findelementXp("//span[text()='SETS']").click();
		Thread.sleep(4500);
		findelementXp("//a[text()='ZAFUL Colorblock Panel Jacket And Pants Set - Multi-b M']").click();
		Thread.sleep(3000);
		
		findelementXp("(//a[text()='M'])[6]").click();
		Thread.sleep(2000);
		findelementXp("(//a[text()='L'])[6]").click();
		Thread.sleep(2000);
		findelementXp("(//a[text()='2XL'])[6]").click();
		Thread.sleep(2000);
		findelementXp("(//a[text()='XL'])[6]").click();
		Thread.sleep(2000);
		findelementXp("(//a[@class='gallery-nav-next gallery-nav-item'])").click();
		System.out.println(" First PIC ");
		Thread.sleep(2000);
		findelementXp("(//a[@class='gallery-nav-next gallery-nav-item'])").click();
		System.out.println(" Second PIC ");
		Thread.sleep(2000);
		findelementXp("(//a[@class='gallery-nav-next gallery-nav-item'])").click();
		System.out.println(" 3rd PIC ");
		Thread.sleep(2000);
		findelementXp("(//a[@class='gallery-nav-next gallery-nav-item'])").click();
		System.out.println(" 4th PIC ");
		Thread.sleep(2000);
		findelementXp("(//img[@class='active js_loadingimg'])");
		mousehover(elementxp);
		System.out.println("Mousehover Completed");
		Thread.sleep(2000);
		findelementXp("(//a[@class='logsss_event_cl'])[3]").click();
		Thread.sleep(2000);
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\Cucumber_Project\\Screen Shot\\bag2.png");
		Thread.sleep(1000);
		findelementXp("//span[text()='ADD TO BAG']").click();
		Thread.sleep(2000);
		findelementXp("//i[@class='bag-icon']").click();
		
		Thread.sleep(2000);
		findelementXp("//a[text()='SECURE CHECKOUT']").click();
		Thread.sleep(3000);
		findelementXp("(//a[text()='Edit'])[1]").click();
		Thread.sleep(2000);
		findelementId("email").click();
		findelementId("firstname").click();
		findelementId("lastname").click();
		findelementId("addressline1").click();
		Thread.sleep(2000);
		findelementXp("(//span[text()='SAVE & CONTINUE'])").click();
		Thread.sleep(2000);
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\Cucumber_Project\\Screen Shot\\address1.png");
		Thread.sleep(1000);
		findelementXp("//a[@class='logoimg']").click();
		Thread.sleep(2000);
		findelementXp("//a[@class='js-topaccount-user account-user-icon logsss_event_cl']");
		mousehover(elementxp);
		Thread.sleep(1000);
		findelementXp("//a[text()='SIGN OUT']").click();
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\Cucumber_Project\\Screen Shot\\logout.png");
		System.out.println("Logout Successfull");
		
		}

}
