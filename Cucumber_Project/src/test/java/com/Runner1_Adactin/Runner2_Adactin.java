package com.Runner1_Adactin;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.BaseClass_1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature1_Adactin\\Adac_ScenarioOutline.feature",
glue = "com\\StepDefinition1_Adactin")


public class Runner2_Adactin {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void setup() {
		
		driver=BaseClass_1.getbrowser("chrome");
		

	}

}
