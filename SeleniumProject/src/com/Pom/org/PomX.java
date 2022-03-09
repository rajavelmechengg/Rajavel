package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomX {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']") private WebElement username;
	@FindBy(id = "password")private WebElement password;
	@FindBy(id = "login") private WebElement loginbt;
	@FindBy(id = "location")private WebElement location;
	@FindBy(id = "hotels")private WebElement hotels;
	@FindBy(id = "room_type")private WebElement roomType;
	@FindBy(id = "room_nos")private WebElement nosRoom;
	@FindBy(id = "datepick_in")private WebElement InDate;
	@FindBy(id = "datepick_out")private WebElement outDate;
	@FindBy(id = "adult_room")private WebElement nosAdult;
	@FindBy(id = "child_room")private WebElement nosChild;
	@FindBy(id = "Submit")private WebElement submitBt;
	@FindBy(id = "radiobutton_0")private WebElement sellectclick;
	@FindBy(id = "continue")private WebElement continueclick;
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
	
	
	
	
	

	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNosRoom() {
		return nosRoom;
	}

	public WebElement getInDate() {
		return InDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getNosAdult() {
		return nosAdult;
	}

	public WebElement getNosChild() {
		return nosChild;
	}

	public WebElement getSubmitBt() {
		return submitBt;
	}

	public WebElement getSellectclick() {
		return sellectclick;
	}

	public WebElement getContinueclick() {
		return continueclick;
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

	public WebElement getLoginbt() {
		return loginbt;
	}

	public WebElement getPassword() {
		return password;
	}

	public PomX(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

}
