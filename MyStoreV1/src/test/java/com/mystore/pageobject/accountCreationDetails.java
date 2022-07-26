package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accountCreationDetails {
			

	// Create object of Local WebDriver 
	
	WebDriver ldriver;
	
	// Create object of Remote WebDriver using constructor
	public accountCreationDetails(WebDriver rdriver)
	{
				
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	//Identify the web elements
	
	@FindBy(id="id_gender1")
	WebElement gender;
	
	@FindBy(id = "customer_firstname")
	WebElement customer_firstname;
	
	@FindBy(id = "customer_lastname")
	WebElement customer_lastname;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement passwd;
	
	@FindBy(id = "firstname")
	WebElement add_firstname;
	
	@FindBy(id = "lastname")
	WebElement add_lastname;
	
	@FindBy(id = "company")
	WebElement add_company;
	
	@FindBy(id = "address1")
	WebElement add_address1;
	
	@FindBy(id="address2")
	WebElement add_address2;
	
	@FindBy(id="city")
	WebElement add_city;
	
	@FindBy(id="id_state")
	WebElement add_state;
	
	@FindBy(id="postcode")
	WebElement add_postcode;
	
	@FindBy(id="id_country")
	WebElement add_country;
	
	@FindBy(id="phone_mobile")
	WebElement add_phone_mobile;
	
	@FindBy(id="alias")
	WebElement r_alias;
	
	@FindBy(id="submitAccount")
	WebElement SubAcco;
	
	
	
	
	
	//action method to enter the account creation data
	
	public void APersonalInfo(String Firstname, String Lastname, String Email, String Passwd, String addfirstname,
			String addlastname,String addcompany, String addaddress1, String addaddress2,
			String addcity, String ad_State,String addpostcode,String ad_country, String addphonemobile, String refs_alias) {
		
		gender.click();
		customer_firstname.sendKeys(Firstname);
		customer_lastname.sendKeys(Lastname);
		email.clear();
		email.sendKeys(Email);
		passwd.sendKeys(Passwd);
		add_firstname.clear();
		add_firstname.sendKeys(addfirstname);
		add_lastname.clear();
		add_lastname.sendKeys(addlastname);
		add_company.sendKeys(addcompany);
		add_address1.sendKeys(addaddress1);
		add_address2.sendKeys(addaddress2);
		add_city.sendKeys(addcity);
		Select abc = new Select(add_state);
		abc.selectByVisibleText(ad_State);
	
		add_postcode.sendKeys(addpostcode);
		
		Select abcs = new Select(add_country);
		abcs.selectByVisibleText(ad_country);
		add_phone_mobile.sendKeys(addphonemobile);
		r_alias.clear();
		r_alias.sendKeys(refs_alias);		

	}	
	
	//Enter the submit  button.
	
	public void SubAccos() {
	
		SubAcco.click();

	}
	
	
}
