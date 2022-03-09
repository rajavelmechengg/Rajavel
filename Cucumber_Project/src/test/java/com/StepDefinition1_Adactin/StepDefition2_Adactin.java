package com.StepDefinition1_Adactin;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_1;
import com.Runner1_Adactin.Runner2_Adactin;

import io.cucumber.java.en.*;

public class StepDefition2_Adactin extends BaseClass_1{
	
	public static WebDriver driver = Runner2_Adactin.driver;
	
	
	
	@Given("user Launch the application")
	public void user_launch_the_application() {
	    System.out.println("Launched the app");
	    geturl("https://adactinhotelapp.com/");
	    
	}
	@When("The user enters the username {string} and pass word {string}")
	public void the_user_enters_the_username_and_pass_word(String username, String password) {
		findelementId("username");
	    elementid.sendKeys(username);
	    findelementId("password");
		elementid.sendKeys(password);
	    
	}
	@When("The user click the login button")
	public void the_user_click_the_login_button() {
		findelementId("login");
		elementid.click();
	    
	}
	@Then("User validate the login process")
	public void user_validate_the_login_process() {
	    System.out.println("Verify ");
	    
	}
	
	
	
	
	
	


}
