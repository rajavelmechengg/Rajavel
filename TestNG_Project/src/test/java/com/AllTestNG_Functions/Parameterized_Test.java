package com.AllTestNG_Functions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"empName" , "empId"})
	private void empDetails(String empName, int empId) {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+empId);

	}

}
