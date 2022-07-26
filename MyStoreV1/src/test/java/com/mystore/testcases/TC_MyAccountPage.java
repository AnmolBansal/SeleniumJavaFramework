package com.mystore.testcases;

import org.testng.annotations.Test;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.MyAccount;
import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.registedUserAccount;

import junit.framework.Assert;

// Extends class from parents class to base class
public class TC_MyAccountPage extends BaseClass{
	
	
	//Test Case for Registration
	@Test
	public void VerifyRegistrationAndLogin() {
		
		//Open url
		driver.get(url);
		logger.info("Url open");
		
		IndexPage page = new IndexPage(driver);
		
		page.ClickOnSignButton();
		logger.info("Click on Sign In Button");

		
		MyAccount myaccount = new MyAccount(driver);
		
		myaccount.EneterEmailID("anmol.bansal222@gmail.com");
		logger.info("Enter the email id");

		myaccount.ClickOnCreateButton();
		logger.info("Click on create button");
		
		accountCreationDetails ACD = new accountCreationDetails(driver);

		ACD.APersonalInfo("Anmol", "Bansal","anmol.bansal222@gmail.com", "123456", "Anmol", "Bansal", "Facebook", "#21061 Ajit Road", "10 B", "Bathinda", "California", "00000", "United States", "9041953323", "No Address");
		logger.info("Enter the personal infomation ");

		
		ACD.SubAccos();
		logger.info("click on submit button ");

		
		registedUserAccount RegUseAcc = new registedUserAccount(driver);
		String Usename = RegUseAcc.GetUserName();
		
		Assert.assertEquals("Anmol Bansal", Usename);
		
		logger.info("Validate the User Account");

		
		
	}

}
