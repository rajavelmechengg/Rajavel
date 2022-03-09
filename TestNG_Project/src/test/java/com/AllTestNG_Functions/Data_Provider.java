package com.AllTestNG_Functions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "testData")
	private void empDetails(String empName, int empId) {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee ID : " + empId);

	}
	
	@DataProvider
	private Object[][] testData() {
		return new Object[][] { { "Rajavel", 8870 }, { "Raj", 9944 }, { "Karthi", 5000 } };

	}

	@Test(dataProvider = "testData")
	private void loginDetails(String username, int password) {
		System.out.println("User Name : " + username);
		System.out.println("PassWord : " + password);
	}
	
	
	

}
