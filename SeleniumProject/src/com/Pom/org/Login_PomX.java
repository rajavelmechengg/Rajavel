package com.Pom.org;

import java.io.IOException;

import com.BaseClass.org.Baseclass1;

public class Login_PomX extends Baseclass1{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		getbrowser("chrome");
		geturl("https://adactinhotelapp.com/");
		
		PomX p = new PomX(driver);
		
		sendkey(p.getUsername(), "RAJAVELGANESAN");
		sendkey(p.getPassword(), "raja9944532517");
		p.getLoginbt().click();
		dropdown(p.getLocation(),"value","London");
		dropdown(p.getHotels(), "index", "1");
		dropdown(p.getRoomType(), "index", "2");
		dropdown(p.getNosRoom(), "value", "1");
		p.getInDate().clear();
		sendkey(p.getInDate(), "26/01/2022");
		p.getOutDate().clear();
		sendkey(p.getOutDate(), "30/01/2022");
		dropdown(p.getNosAdult(), "value", "2");
		dropdown(p.getNosChild(), "index", "1");
		p.getSubmitBt().click();
		p.getSellectclick().click();
		p.getContinueclick().click();
		sendkey(p.getFirstName(), "Rajavel");
		sendkey(p.getLastName(), "G");
		sendkey(p.getAddress(), "Kongu Nagar  Annasalai");
		sendkey(p.getCardNumber(), "1234567890123456");
		dropdown(p.getCardType(), "index"	,"3");
		dropdown(p.getExpMonth(), "index","12");
		dropdown(p.getExpYear(), "value", "2022");
		sendkey(p.getCcvNum(), "1234");
		p.getBookNowBt().click();
		Thread.sleep(9000);
		p.getItinery().click();
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\SeleniumProject\\Screenshot\\zzz.png");
		p.getLogout().click();
		
		
		
		
		
		
		
	}

}
