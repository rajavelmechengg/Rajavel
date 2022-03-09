package com.Helper_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom.ConfirmPage;
import com.Pom.LoginPage;
import com.Pom.SelectHotelPage;

public class POManager_Adactin {
	
	public static WebDriver driver; 
	
	private ConfirmPage cp;
	private LoginPage lp;
	private SelectHotelPage sp;
	
	public POManager_Adactin(WebDriver driver2) {
		this.driver = driver2;
		
	}
	public ConfirmPage getCp() {
	cp = new ConfirmPage(driver);
		return cp;
	}
	public LoginPage getLp() {
		 lp = new LoginPage(driver);
		return lp;
	}
	public SelectHotelPage getSp() {
		 sp = new SelectHotelPage(driver);
		return sp;
	}
	
	

}
