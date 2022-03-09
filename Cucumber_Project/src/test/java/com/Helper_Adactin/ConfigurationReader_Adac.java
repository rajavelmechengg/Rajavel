package com.Helper_Adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader_Adac {
	
	public static Properties pro;
	
	public ConfigurationReader_Adac () throws IOException   {
		
	File f = new File("C:\\Users\\Raja\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\PropertyFile_Adactin\\Adactin.property");
	FileInputStream fs = new FileInputStream(f);
	 pro = new Properties();
	pro.load(fs);
}
	
	public String getbrowser() {
		String browser = pro.getProperty("browser");
		
		System.out.println(browser);
		return browser;

	}
	
	public String geturl() {
		String url = pro.getProperty("url");
		System.out.println(url);
		return url;
		
	}
	
	public String username() {
		String username = pro.getProperty("username");
		System.out.println(username);
		return username;
	}
	
	public String password() {
		String password = pro.getProperty("password");
		System.out.println(password);
		return password;
	}
	
	public String address() {
		String address = pro.getProperty("address");
		System.out.println(address);
		return address;
	}
	
	public String creditcard() {
		String creditcard = pro.getProperty("creditcard");
		System.out.println(creditcard);
		return creditcard;
	}
	
	public String ccv() {
		String ccv = pro.getProperty("ccv");
		System.out.println(ccv);
		return ccv;
	}
	
	public String chechin() {
		String checkin = pro.getProperty("checkin");
		System.out.println(checkin);
		return checkin;
	}
	
	public String checkout() {
		String checkout = pro.getProperty("checkout");
		System.out.println(checkout);
		return checkout;
	}
	
	public static void main(String[] args) throws IOException {
		
		ConfigurationReader_Adac cr = new ConfigurationReader_Adac();
		
		cr.getbrowser();
		cr.geturl();
		cr.username();
		cr.password();
		cr.address();
		cr.creditcard();
		cr.ccv();
		cr.chechin();
		cr.checkout();
	}
	
}