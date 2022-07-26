package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	
	//use a pacpage of Properties  which is default there.
	
	Properties properties;
	
	String path = "/Users/anmolbansal/Desktop/CS_Automation_Framework/MyStoreV1/configuration/Config.properties";
	
	//create constructor
	public ReadConfig() {
		
		try {
		//Initialize properties
		properties = new Properties();
		
		//create a object for read the file path and add try and catch block of new FileInputStream
		
			FileInputStream fis = new FileInputStream(path);
			
			//Now we have to load the files.
			properties.load(fis);
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//to read the value of the base url from config properties
	public String getbaseurl() {
		
		String value = properties.getProperty("baseUrl");
		
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url not specified in config file");
		
	}
	
	
	//to read the value of the browser  from config properties
		public String getBrowser() {
			
			String value = properties.getProperty("browser");
			
			if(value!=null)
				return value;
			else
				throw new RuntimeException("Browser is not specified in config file");
			
		}
	
	
}
