package com.AllTestNG_Functions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setup() {
		System.out.println("Setup");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void enterurl() {
		System.out.println("Enter URL");
	}

	@BeforeMethod
	private void userLogin() {
		System.out.println("User Login");
	}

	@Test
	private void mobile_Search() {
		System.out.println("Mobile Search");
	}

	@Test
	private void laptop_Search() {
		System.out.println("Laptop Search");
	}

	@Test
	private void cycle_Search() {
		System.out.println("Cycle Search");
	}

	@Test
	private void Tv_Search() {
		System.out.println("TV Search");
	}

	@Test
	private void earPhone_Search() {
		System.out.println("Ear Phone Search");
	}
	
	@AfterMethod
	private void verifyHomePage() {
System.out.println("Verify Home Page");
	}
	
	@AfterClass
	private void logOut() {
System.out.println("Logout");
	}
	
	@AfterTest
	private void deleteCookies() {
System.out.println("Delete Cookies");
	}
	
	@AfterSuite
	private void browserClose() {
System.out.println("Browser Close");
	}
	

}
