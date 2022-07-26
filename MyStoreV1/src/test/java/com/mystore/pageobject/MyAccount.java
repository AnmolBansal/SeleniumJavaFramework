/**
 * 
 */
package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author anmolbansal
 *
 */
public class MyAccount {


	// Create object of Local WebDriver 
	
	WebDriver ldriver;
	
	// Create object of Remote WebDriver using constructor
	public MyAccount(WebDriver rdriver)
	{
				
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}

	//Identify WebElements using PageFactory
	
	@FindBy(id = "email_create")
	WebElement emailCreate;

	@FindBy(id = "SubmitCreate")
	WebElement submitCreates;
	
	//Identify Action for enter email address
	public void EneterEmailID(String emailadds) {
			
		emailCreate.sendKeys(emailadds);
			
		}
	//Identify Action for click on create button
	public void ClickOnCreateButton() {
		
		submitCreates.click();
		
	}
	
}
