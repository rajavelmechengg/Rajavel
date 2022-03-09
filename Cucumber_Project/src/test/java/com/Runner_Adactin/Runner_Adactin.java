package com.Runner_Adactin;

import java.io.FileReader;
import java.sql.Driver;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass_1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature_Adactin", glue = "com\\StepDefinition_Adactin")
/*
 * ,dryRun = false, monochrome = false, Plugin = "pretty")
 */

public class Runner_Adactin {
	public static WebDriver driver;

	@BeforeClass
	public static void browser() {

		driver = BaseClass_1.getbrowser("chrome");

	}

}
