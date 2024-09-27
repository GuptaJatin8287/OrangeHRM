package com.orange.testcases;

import org.apache.logging.log4j.core.Core;
import org.testng.annotations.Test;

import com.orange.pageobject.loginpage;
import com.orange.utilities.readconfig;

public class TC_LoginPage extends BaseClass{
	
	@Test
	public void verifylogin() {
		
		readconfig rc = new readconfig();
		rc.getusername();
		System.out.println(username);
		loginpage lp = new loginpage(driver);
		lp.enterusername(username);
		log.info("Username Entered");
		lp.enterpassword(password);
		log.info("Password Entered");
		lp.clickonsubmit();
		log.info("Click on Submit");
	}
	


}
