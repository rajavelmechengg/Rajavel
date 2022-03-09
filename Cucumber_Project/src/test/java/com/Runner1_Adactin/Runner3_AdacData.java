package com.Runner1_Adactin;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\java\\com\\Feature1_Adactin\\Adac_Data.feature",
glue = "com\\StepDefinition1_Adactin")

public class Runner3_AdacData {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static  void setup() {

		driver= BaseClass_1.getbrowser("chrome");
	}

}
