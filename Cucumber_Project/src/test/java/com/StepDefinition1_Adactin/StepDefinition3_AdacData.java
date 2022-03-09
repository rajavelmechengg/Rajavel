package com.StepDefinition1_Adactin;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_1;
import com.Runner1_Adactin.Runner3_AdacData;

import io.cucumber.java.en.*;

public class StepDefinition3_AdacData extends BaseClass_1 {
	
	public static WebDriver driver = Runner3_AdacData.driver;
	
	
	@Given("User Lanched the Hotel app")
	public void user_lanched_the_hotel_app() {
		
		 System.out.println("Launched the application");
		    geturl("https://adactinhotelapp.com/");
	    
	    
	}
	@When("The user enter the username and password")
	public void the_user_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<String> row = dataTable.row(2);
		
		findelementId("username");
	    elementid.sendKeys(row.get(0));
	    findelementId("password");
		elementid.sendKeys(row.get(1));
	    
	}
	@When("The user click the loging button")
	public void the_user_click_the_loging_button() {
	    // Write code here that turns the phrase above into concrete actions
		findelementId("login");
		
		elementid.click();
	    
		
	}
	@Then("user verifies the login page is sucessful")
	public void user_verifies_the_login_page_is_sucessful() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Verification and Validation");
		
	}

	
	

}
