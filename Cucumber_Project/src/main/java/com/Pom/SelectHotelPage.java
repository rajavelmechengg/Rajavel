package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public static WebDriver driver;
	
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
	
	
	public SelectHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
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
	
	
	

}
