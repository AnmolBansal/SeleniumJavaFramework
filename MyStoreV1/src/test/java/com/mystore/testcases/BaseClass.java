package com.mystore.testcases;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//create a package ReadConfig from utilities. 
	ReadConfig readConfig = new ReadConfig();
	
	String url = readConfig.getbaseurl();
	String browser = readConfig.getBrowser();
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void SetupLaunchBrowser() {
		
				
		switch(browser.toLowerCase())
		{
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		
		default:
			driver=null;
			break;

		
		}
		
		//to lanuch the browser we have write 10 Seconds.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//for logging
		logger = LogManager.getLogger("MyStoreV1");
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
	}

}
