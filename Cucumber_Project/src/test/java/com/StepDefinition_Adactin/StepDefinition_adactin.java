package com.StepDefinition_Adactin;

import io.cucumber.java.en.Given;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass_1;
import com.Pom.Pom_Adactin;
import com.Runner_Adactin.Runner_Adactin;

import io.cucumber.java.en.*;

public class StepDefinition_adactin extends BaseClass_1{
	
	public static WebDriver driver = Runner_Adactin.driver;

	
	
	@Given("Adactin home page Launched s1")
	public void adactin_home_page_launched_s1() {
		geturl("https://adactinhotelapp.com/");
	}
	
	@When("The user click the login button s1")
	public void the_user_click_the_login_button_s1() {
		findelementId("login");
		elementid.click();
	}
	
	@Then("The user verifies that valid notification is displayed s1")
	public void the_user_verifies_that_valid_notification_is_displayed_s1() throws InterruptedException {
		Thread.sleep(2000);
	   System.out.println("First Time Check the Popup Notification"); 
	    
	}

	
	@When("The user enters the invalid username s2")
	public void the_user_enters_the_invalid_username_s2() {
		findelementId("username");
	    elementid.sendKeys("RAJAVEL");
	    
	}
	@When("The user enters the invalid password s2")
	public void the_user_enters_the_invalid_password_s2() {
		findelementId("password");
		elementid.sendKeys("9944532517");
	    
	}
	@When("The user click the login button s2")
	public void the_user_click_the_login_button_s2() {
		findelementId("login");
		elementid.click();
	    
	}
	@Then("User verifies that valid notification is displayed	s2")
	public void user_verifies_that_valid_notification_is_displayed_s2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Second Time Check the Popup Notification");
	    
	}

	
	@When("The user enters the invalid username s3")
	public void the_user_enters_the_invalid_username_s3() {
		findelementId("username");
	    elementid.sendKeys("RAJAVEL");
	    
	}
	@When("The user enters the valid password s3")
	public void the_user_enters_the_valid_password_s3() {
		findelementId("password");
		elementid.sendKeys("raja9944532517");
	    
	}
	@When("The user click the login button s3")
	public void the_user_click_the_login_button_s3() {
		findelementId("login");
		elementid.click();

	    
	}
	@Then("User verifies that valid notification is displayed s3")
	public void user_verifies_that_valid_notification_is_displayed_s3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Third Time Check the Popup Notification");
	    
	}

	
	@When("The user enters the valid username s4")
	public void the_user_enters_the_valid_username_s4() {
		 findelementId("username");
		    elementid.sendKeys("RAJAVELGANESAN");
	    
	}
	@When("The user enters the invalid password s4")
	public void the_user_enters_the_invalid_password_s4() {
		findelementId("password");
		elementid.sendKeys("raja");
	    
	}
	@When("The user click the login button s4")
	public void the_user_click_the_login_button_s4() {
		findelementId("login");
		elementid.click();
	    
	}
	@Then("User verifies that valid notification is displayed s4")
	public void user_verifies_that_valid_notification_is_displayed_s4() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Fourth Time Check the Popup Notification");
	    
	}

	
	
	@Given("Adactin home page Launched\\(T4)")
	public void adactin_home_page_launched_t4() {
		geturl("https://adactinhotelapp.com/");
		
		
	    
	}
	@When("The user enters the valid username\\(T4)")
	public void the_user_enters_the_valid_username_t4() {
	    findelementId("username");
	    elementid.sendKeys("RAJAVELGANESAN");
	    
	}
	@When("The user enters the valid password\\(T4)")
	public void the_user_enters_the_valid_password_t4() {
		findelementId("password");
		elementid.sendKeys("raja9944532517");
	    
	    
	}
	@When("The user click the login button\\(T4)")
	public void the_user_click_the_login_button_t4() {
		findelementId("login");
		elementid.click();
	    
	}
	@Then("User verifies the login is successful\\(T4)")
	public void user_verifies_the_login_is_successful_t4() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Application Login Completed Successfully");
	    
	}

	
	
	
	@Given("The user entered search hotel page")
	public void the_user_entered_search_hotel_page() {
	    System.out.println("Successfully Entered the Search Hotel Page");
	    
	}
	@When("The user select the prefered location")
	public void the_user_select_the_prefered_location() {
	    findelementId("location");
	    dropdown(elementid, "index" ,"2");
	    
	    
	}
	@When("The user select the prefered hotel")
	public void the_user_select_the_prefered_hotel() {
	    findelementId("hotels");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user select the prefered room type")
	public void the_user_select_the_prefered_room_type() {
	    findelementId("room_type");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user select the  number of rooms")
	public void the_user_select_the_number_of_rooms() {
	    findelementId("room_nos");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user enter the checkin date")
	public void the_user_enter_the_checkin_date() {
	    findelementId("datepick_in");
	    elementid.clear();
	    sendkeyId("20/02/2022");
	    
	}
	@When("The user enter the checkout date")
	public void the_user_enter_the_checkout_date() {
	    findelementId("datepick_out");
	    elementid.clear();
	    sendkeyId("25/02/2022");
	    
	}
	@When("The user select the number of audults per room")
	public void the_user_select_the_number_of_audults_per_room() {
	    findelementId("adult_room");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user select the number of children")
	public void the_user_select_the_number_of_children() {
	    findelementId("child_room");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user click the search button")
	public void the_user_click_the_search_button() {
	    findelementId("Submit");
	    elementid.click();
	    
	}
	@Then("The user verifies current page is successfully move to next page")
	public void the_user_verifies_current_page_is_successfully_move_to_next_page() throws InterruptedException {
		Thread.sleep(2000);
	    System.out.println("successfully Entered Required details");
	    
	}
	
	
	
	@Given("The user entered confirmed hotel page")
	public void the_user_entered_confirmed_hotel_page() {
		System.out.println("Successfully Entered the Confirm Hotel Page");
	    
	}
	@When("The user select the confirmed hotel")
	public void the_user_select_the_confirmed_hotel() {
	    findelementId("radiobutton_0");
	    elementid.click();
	    
	}
	@When("The user click the contiue button")
	public void the_user_click_the_contiue_button() throws InterruptedException {
	    findelementId("continue");
	    Thread.sleep(2000);
	    elementid.click();
	    
	}

	
	@Given("The user entered the payment details page")
	public void the_user_entered_the_payment_details_page() {
		System.out.println("Successfully Entered the Confirm Payment Details Page");
	    
	}
	@When("The user enter the  first name")
	public void the_user_enter_the_first_name() {
	    findelementId("first_name");
	    elementid.sendKeys("RAJAVEL");
	    
	}
	@When("The user enter the last name")
	public void the_user_enter_the_last_name() {
	    findelementId("last_name");
	    elementid.sendKeys("G");
	    
	}
	@When("The user enter the  billing addresss")
	public void the_user_enter_the_billing_addresss() {
	    findelementId("address");
	    elementid.sendKeys("Adyar Chennai");
	    
	}
	@When("The user enter the credit card number")
	public void the_user_enter_the_credit_card_number() {
	    findelementId("cc_num");
	    elementid.sendKeys("1234567890123456");
	    
	}
	@When("The user select the credit card type")
	public void the_user_select_the_credit_card_type() {
	    findelementId("cc_type");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user enter the expiry month")
	public void the_user_enter_the_expiry_month() {
	    findelementId("cc_exp_month");
	    dropdown(elementid, "index", "2");
	    
	}
	@When("The user enter the expiry year")
	public void the_user_enter_the_expiry_year() {
	    findelementId("cc_exp_year");
	    dropdown(elementid, "index", "5");
	    
	}
	@When("The user enter the ccv number")
	public void the_user_enter_the_ccv_number() {
	    findelementId("cc_cvv");
	    elementid.sendKeys("123");
	    
	}
	@When("The user click the book now button")
	public void the_user_click_the_book_now_button() throws InterruptedException {
		Thread.sleep(3000);
	    findelementId("book_now");
	    elementid.click();
	    
	    
	}
	@Then("The user verifies the hotel booking summary")
	public void the_user_verifies_the_hotel_booking_summary() throws InterruptedException {
		Thread.sleep(9000);
	    findelementId("my_itinerary");
	    elementid.click();
	    
	}
	@Then("The user click the logout button")
	public void the_user_click_the_logout_button() throws InterruptedException {
		Thread.sleep(5000);
	    findelementId("logout");
	    elementid.click();
	    
	}
	@Then("The user verifies the logout is successful")
	public void the_user_verifies_the_logout_is_successful() {
	    System.out.println("Adactin Hotel Room Booking Completed Successfully");
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	    
	}





	



	


	




