package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")private WebElement firstName;
	@FindBy(id = "last_name")private WebElement lastName;
	@FindBy(id = "address")private WebElement address;
	@FindBy(id = "cc_num")private WebElement cardNumber;
	@FindBy(id = "cc_type")private WebElement cardType;
	@FindBy(id = "cc_exp_month")private  WebElement expMonth;
	@FindBy(id = "cc_exp_year")private WebElement expYear;
	@FindBy(id = "cc_cvv")private WebElement ccvNum;
	@FindBy(id = "book_now")private WebElement bookNowBt;
	@FindBy(id = "my_itinerary")private WebElement itinery;
	@FindBy(id = "logout")private WebElement logout;
	
	
	
	
	public ConfirmPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCcvNum() {
		return ccvNum;
	}
	public WebElement getBookNowBt() {
		return bookNowBt;
	}
	public WebElement getItinery() {
		return itinery;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	
	
	

}
