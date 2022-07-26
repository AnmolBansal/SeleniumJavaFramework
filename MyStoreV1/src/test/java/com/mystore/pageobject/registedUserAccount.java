package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registedUserAccount {
	
	// Create object of Local WebDriver 
	
	WebDriver ldriver;
	
	// Create object of Remote WebDriver using constructor
	public registedUserAccount(WebDriver rdriver)
	{
				
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}

	//Identify WebElements using PageFactory
	@FindBy(xpath = "//a[@title='View my customer account']")	
	WebElement emailCreate;


	
	//Identify Get Username
	public String GetUserName() {
			
		String Texts = emailCreate.getText();
		
		return Texts;
		
		}


}
