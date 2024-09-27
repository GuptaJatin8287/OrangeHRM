package com.orange.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readconfig {
	Properties property;
	String path ="C:\\Rest-Assured-API\\OrangeHRM_Website_Actions\\OrangeHRM_Actions\\Configuration\\config.properties";
	
	public readconfig() {
		property = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			property.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getusername() {
		String value = property.getProperty("username");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("Username not specified in config file");
		
	}
	public String getpassword() {
		String pass = property.getProperty("password");
		if(pass!=null)
			return pass;
		else 
			throw new RuntimeException("password not specified in config file");
	}
	public String getbrowser() {
		String browser = property.getProperty("browser");
		if(browser!=null)
			return browser;
		else 
			throw new RuntimeException("password not specified in config file");
	}
}
