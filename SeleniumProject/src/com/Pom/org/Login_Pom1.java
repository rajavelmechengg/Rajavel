package com.Pom.org;

import java.io.IOException;

import com.BaseClass.org.BaseClass;
import com.BaseClass.org.Baseclass1;

public class Login_Pom1 extends Baseclass1 {
	public static void main(String[] args) throws IOException {
		
		getbrowser("chrome");
		geturl("https://www.facebook.com/login/");
		
		Pom1 p = new Pom1(driver);
		sendkey(p.getFbusername(), "sai");
		sendkey(p.getFbpass(), "12345");
		p.getFbclick().click();
	}

}
