package com.AllTestNG_Functions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Class {
	
	/* MyRetry Analyzer class mainly used for Unstable network and 
	systemslow perfomance time some errors occurs that time MyRetry Analyzer helps to Retest (retry) the methods */
	
	@Test(retryAnalyzer = MyRetry_MethodLevel.class) 
	private void idValidation() {
		
	//	Assert.assertEquals("Rajavel", "Rajavel");
		
		assertEquals("Rajavel", "rajavel");
		
	}
	
	@Test(retryAnalyzer = MyRetry_MethodLevel.class)
	private void passwordValidation() {
		
		assertEquals("raja9944", "raja9944");
	}
	
	
	@Test
	private void newPasswordValidation() {
		
		assertEquals("8870", "1234");
	}

}
