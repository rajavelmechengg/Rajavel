package com.StepDefinition1_Adactin;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_1;
import com.Helper_Adactin.FileReaderManager_Adac;
import com.Helper_Adactin.POManager_Adactin;
import com.Pom.Pom_Adactin;
import com.Runner1_Adactin.Runner1;

import io.cucumber.java.en.*;

public class StepDefinition1 extends BaseClass_1 {
	
	public static WebDriver driver = Runner1.driver;
	
	//Pom_Adactin p = new Pom_Adactin(driver);
	POManager_Adactin pom = new POManager_Adactin(driver);
	
	@Given("Adactin home page Launched s1")
	public void adactin_home_page_launched_s1() throws IOException {
		//geturl("https://adactinhotelapp.com/");
		geturl(FileReaderManager_Adac.getInstance().getcrInstance().geturl());
		System.out.println("Adactin Hotel Application Launched");
	    
	    
	}
	@When("The user click the login button s1")
	public void the_user_click_the_login_button_s1() {
	  //  p.getLoginbt().click();
	    pom.getLp().getLoginbt().click();
	    
	}
	@Then("The user verifies that valid notification is displayed s1")
	public void the_user_verifies_that_valid_notification_is_displayed_s1() {
		System.out.println("First Time Check the Popup Notification");
	    
	}

	
	
	@When("The user enters the invalid username s2")
	public void the_user_enters_the_invalid_username_s2() {
	  //  sendkey(p.getUsername(), "qwerr");
	    sendkey(pom.getLp().getUsername(), "asdfgh");
		
	}
	@When("The user enters the invalid password s2")
	public void the_user_enters_the_invalid_password_s2() {
	   // sendkey(p.getPassword(), "8870");
	    sendkey(pom.getLp().getPassword(), "12345678");
		
	}
	@When("The user click the login button s2")
	public void the_user_click_the_login_button_s2() {
	  //  p.getLoginbt();
	    pom.getLp().getLoginbt().click();
	}
	@Then("User verifies that valid notification is displayed	s2")
	public void user_verifies_that_valid_notification_is_displayed_s2() {
		System.out.println("Second Time Check the Popup Notification");
	    
	}



	
	
	
	@When("The user enters the invalid username s3")
	public void the_user_enters_the_invalid_username_s3() {
		//sendkey(p.getUsername(), "RAJAVEL");
	    sendkey(pom.getLp().getUsername(), "rajavelkamaraj");
	}
	@When("The user enters the valid password s3")
	public void the_user_enters_the_valid_password_s3() throws IOException {
	  //  sendkey(p.getPassword(), "raja9944532517");
	    sendkey(pom.getLp().getPassword(), FileReaderManager_Adac.getInstance().getcrInstance().password());
		
	}
	@When("The user click the login button s3")
	public void the_user_click_the_login_button_s3() {
	  //  p.getLoginbt().click();
		pom.getLp().getLoginbt().click();
	    
	}
	@Then("User verifies that valid notification is displayed s3")
	public void user_verifies_that_valid_notification_is_displayed_s3() {
		System.out.println("Third Time Check the Popup Notification");
	    
	}


	
	
	
	
	
	@When("The user enters the valid username s4")
	public void the_user_enters_the_valid_username_s4() throws IOException {
	//	sendkey(p.getUsername(), "RAJAVELGANESAN");
	  sendkey(pom.getLp().getUsername(), FileReaderManager_Adac.getInstance().getcrInstance().username());
		
	}
	@When("The user enters the invalid password s4")
	public void the_user_enters_the_invalid_password_s4() {
	//	sendkey(p.getPassword(), "raj32517");
	  sendkey(pom.getLp().getPassword(),"raja994456789");
		
	}
	@When("The user click the login button s4")
	public void the_user_click_the_login_button_s4() {
	//	 p.getLoginbt().click();
		pom.getLp().getLoginbt().click();
	}
	@Then("User verifies that valid notification is displayed s4")
	public void user_verifies_that_valid_notification_is_displayed_s4() {
		System.out.println("Fourth Time Check the Popup Notification");
	    
	}

	
	
	
	
	
	@Given("Adactin home page Launched\\(T4)")
	public void adactin_home_page_launched_t4() throws IOException {
	//	geturl("https://adactinhotelapp.com/");
	  geturl(FileReaderManager_Adac.getInstance().getcrInstance().geturl());
		
	}
	@When("The user enters the valid username\\(T4)")
	public void the_user_enters_the_valid_username_t4() throws IOException {
	//	sendkey(p.getUsername(), "RAJAVELGANESAN");
	  sendkey(pom.getLp().getUsername(), FileReaderManager_Adac.getInstance().getcrInstance().username());
		
	}
	@When("The user enters the valid password\\(T4)")
	public void the_user_enters_the_valid_password_t4() throws IOException {
	//	sendkey(p.getPassword(), "raja9944532517");
	  sendkey(pom.getLp().getPassword(), FileReaderManager_Adac.getInstance().getcrInstance().password());
		
	}
	@When("The user click the login button\\(T4)")
	public void the_user_click_the_login_button_t4() {
	//	p.getLoginbt().click();
	  pom.getLp().getLoginbt().click();
		
	}
	@Then("User verifies the login is successful\\(T4)")
	public void user_verifies_the_login_is_successful_t4() {
	  assertTrue(driver.getCurrentUrl().endsWith("otelapp.com/SearchHotel.php"));
	    System.out.println("User Successfully Login Application");
	}



	
	
	@Given("The user entered search hotel page")
	public void the_user_entered_search_hotel_page() {
		System.out.println("Successfully Entered the Search Hotel Page");
	    
	}
	@When("The user select the prefered location")
	public void the_user_select_the_prefered_location() {
	//    dropdown(p.getLocation(), "index", "2");
	  dropdown(pom.getSp().getLocation(), "index", "2");
		
	}
	@When("The user select the prefered hotel")
	public void the_user_select_the_prefered_hotel() {
	 //   dropdown(p.getHotels(), "index", "2");
	   dropdown(pom.getSp().getHotels(), "index", "2");
		
	}
	@When("The user select the prefered room type")
	public void the_user_select_the_prefered_room_type() {
	  //  dropdown(p.getRoomType(), "index", "2");
	    dropdown(pom.getSp().getRoomType(), "index", "2");
		
	}
	@When("The user select the  number of rooms")
	public void the_user_select_the_number_of_rooms() {
	//    dropdown(p.getNosRoom(), "index", "2");
	  dropdown(pom.getSp().getNosRoom(), "index", "2");
		
	}
	@When("The user enter the checkin date")
	public void the_user_enter_the_checkin_date() throws IOException {
	 //   p.getInDate().clear();
	 //   sendkey(p.getInDate(), "15/02/2022");
	   pom.getSp().getInDate().clear();
	   sendkey(pom.getSp().getInDate(), FileReaderManager_Adac.getInstance().getcrInstance().chechin());
		
		
	}
	@When("The user enter the checkout date")
	public void the_user_enter_the_checkout_date() throws IOException {
	//    p.getOutDate().clear();
	//    sendkey(p.getOutDate(), "20/02/2022");
	  pom.getSp().getOutDate().clear();
	  sendkey(pom.getSp().getOutDate(), FileReaderManager_Adac.getInstance().getcrInstance().checkout());
		
		
	}
	@When("The user select the number of audults per room")
	public void the_user_select_the_number_of_audults_per_room() {
	//    dropdown(p.getNosAdult(), "index", "2");
	  dropdown(pom.getSp().getNosAdult(), "index", "2");
		
	}
	@When("The user select the number of children")
	public void the_user_select_the_number_of_children() {
	 //   dropdown(p.getNosChild(), "index", "2");
	   dropdown(pom.getSp().getNosChild(), "index", "2");
		
	}
	@When("The user click the search button")
	public void the_user_click_the_search_button() throws InterruptedException {
		Thread.sleep(2000);
	 //   p.getSubmitBt().click();
	   pom.getSp().getSubmitBt().click();
		
	}
	@Then("The user verifies current page is successfully move to next page")
	public void the_user_verifies_current_page_is_successfully_move_to_next_page() {
	    assertTrue(driver.getCurrentUrl().endsWith("app.com/SelectHotel.php"));
	    System.out.println("successfully Entered Required details");
	}



	
	
	
	@Given("The user entered confirmed hotel page")
	public void the_user_entered_confirmed_hotel_page() {
		System.out.println("Successfully Entered the Confirm Hotel Page");
	    
	}
	@When("The user select the confirmed hotel")
	public void the_user_select_the_confirmed_hotel() {
	//    p.getSellectclick().click();
		pom.getSp().getSellectclick().click();
	    
	}
	@When("The user click the contiue button")
	public void the_user_click_the_contiue_button() throws InterruptedException {
		Thread.sleep(2000);
	 //   p.getContinueclick().click();
		pom.getSp().getContinueclick().click();
	}



	
	
	
	@Given("The user entered the payment details page")
	public void the_user_entered_the_payment_details_page() {
		System.out.println("Successfully Entered the Confirm Payment Details Page");
	    
	}
	@When("The user enter the  first name")
	public void the_user_enter_the_first_name() {
	//    sendkey(p.getFirstName(), "GRAJA");
		sendkey(pom.getCp().getFirstName(), "RAJAKARTHI");
	    
	}
	@When("The user enter the last name")
	public void the_user_enter_the_last_name() {
	  //  sendkey(p.getLastName(), "G");
	    sendkey(pom.getCp().getLastName(), "G");
	}
	@When("The user enter the  billing addresss")
	public void the_user_enter_the_billing_addresss() throws IOException {
	 //   sendkey(p.getAddress(), "Madippakam,Chennai");
	   sendkey(pom.getCp().getAddress(), FileReaderManager_Adac.getInstance().getcrInstance().address());
		
	}
	@When("The user enter the credit card number")
	public void the_user_enter_the_credit_card_number() throws IOException {
	 //   sendkey(p.getCardNumber(), "1234567890123456");
	   sendkey(pom.getCp().getCardNumber(), FileReaderManager_Adac.getInstance().getcrInstance().creditcard());
		
	}
	@When("The user select the credit card type")
	public void the_user_select_the_credit_card_type() {
	//    dropdown(p.getCardType(), "index", "2");
	 dropdown(pom.getCp().getCardType(), "index", "2");   
	}
	@When("The user enter the expiry month")
	public void the_user_enter_the_expiry_month() {
	//    dropdown(p.getExpMonth(), "index", "6");
	  dropdown(pom.getCp().getExpMonth(), "index", "7");
		
	}
	@When("The user enter the expiry year")
	public void the_user_enter_the_expiry_year() {
	//    dropdown(p.getExpYear(), "index", "5");
	  dropdown(pom.getCp().getExpYear(), "index", "5");
		
	}
	@When("The user enter the ccv number")
	public void the_user_enter_the_ccv_number() throws IOException {
	  //  sendkey(p.getCcvNum(), "123");
	    sendkey(pom.getCp().getCcvNum(), FileReaderManager_Adac.getInstance().getcrInstance().ccv());
	}
	@When("The user click the book now button")
	public void the_user_click_the_book_now_button() throws InterruptedException {
		Thread.sleep(2000);
	//    p.getBookNowBt().click();
	  pom.getCp().getBookNowBt().click();
		
	}
	@Then("The user verifies the hotel booking summary")
	public void the_user_verifies_the_hotel_booking_summary() throws InterruptedException {
		Thread.sleep(9000);
	//    p.getItinery().click();
	  pom.getCp().getItinery().click();
		
	}
	@Then("The user click the logout button")
	public void the_user_click_the_logout_button() throws InterruptedException {
		Thread.sleep(4000);
	//    p.getLogout().click();
	  pom.getCp().getLogout().click();
		
	}
	@Then("The user verifies the logout is successful")
	public void the_user_verifies_the_logout_is_successful() {
		 System.out.println("Adactin Hotel Room Booking Completed Successfully");
	    
	}


}
