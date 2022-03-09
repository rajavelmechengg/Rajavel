package com.Runner1_Adactin;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_1;
import com.Helper_Adactin.FileReaderManager_Adac;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature1_Adactin", glue= "com\\StepDefinition1_Adactin")

public class Runner1 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {
		
		String browser = FileReaderManager_Adac.getInstance().getcrInstance().getbrowser();
		driver = BaseClass_1.getbrowser(browser);

}

}
