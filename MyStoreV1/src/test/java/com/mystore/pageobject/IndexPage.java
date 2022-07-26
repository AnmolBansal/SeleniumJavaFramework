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
 * */

public class IndexPage {

	
	// Create object of Local WebDriver 
	
	WebDriver ldriver;
	
	// Create object of Remote WebDriver using constructor
	public IndexPage(WebDriver rdriver)
	{
				
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}

	//Identify WebElements using PageFactory
	
	@FindBy(linkText = "Sign in")
	WebElement signIn;
	
	
	//Identify Action On WebElement
	public void ClickOnSignButton() {
		
		signIn.click();
		
	}
	
}
