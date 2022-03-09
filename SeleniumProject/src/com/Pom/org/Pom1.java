package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	public static WebDriver driver;
	
	@FindBy(id = "email")private WebElement fbusername;
	@FindBy(xpath = "//input[@type='password']")private WebElement fbpass;
	@FindBy(id = "u_0_d_0X")private WebElement fbclick;
	
	
	public Pom1(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getFbusername() {
		return fbusername;
	}


	public WebElement getFbpass() {
		return fbpass;
	}


	public WebElement getFbclick() {
		return fbclick;
	}
	}
		