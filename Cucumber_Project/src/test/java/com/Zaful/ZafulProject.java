package com.Zaful;

import com.BaseClass.BaseClass_1;

public class ZafulProject extends BaseClass_1{
	
	public static void main(String[] args) throws InterruptedException {
		
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
		findelementId("js_showHeaderSearchForm").click();
		
		findelementId("js-search-input-box").sendKeys("mens shirts");
		Thread.sleep(1000);
		findelementXp("(//i[@class='header-search-icon'])[2]").click();
		Thread.sleep(3000);
		findelementXp("//a[text()='ZAFUL Textured Long Sleeve Pocket Shirt - ']").click();
		Thread.sleep(1000);
		findelementXp("(//a[text()='L'])[6]").click();
		Thread.sleep(1000);
		findelementXp("//span[text()='ADD TO BAG']").click();
		
		
		

		/*	// (OTHER DATAS) NO NEED 
		
		geturl("https://www.zaful.com/sets-e_359/");
		findelementXp("//span[text()='Agree']").click();
		Thread.sleep(3000);
		findelementXp("//a[text()='ZAFUL Colorblock Panel Jacket And Pants Set - Multi-b S']");
		scrollTo(elementxp);
		Thread.sleep(2000);
		elementxp.click();
		//findelementXp("//a[text()='ZAFUL Colorblock Panel Jacket And Pants Set - Multi-b S']").click();
		
		
		//(//img[@title='Letter Pattern Tie Dye Hoodie and Pants Set'])[1]
*/
		
	}

}
