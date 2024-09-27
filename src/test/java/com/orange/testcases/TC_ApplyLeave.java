package com.orange.testcases;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.orange.pageobject.applyLeave;
import com.orange.pageobject.homepage;
import com.orange.pageobject.loginpage;
import com.orange.utilities.readconfig;

public class TC_ApplyLeave extends BaseClass {
	@Test
	public void applyleave() {
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
		
		
		homepage hp = new homepage(driver);
		hp.clickonleave();
		log.info("Login Successfully");
		log.info("Clicked on leave button");
		
		applyLeave al = new applyLeave(driver);
		al.clickonapplybutton();
		//al.clickonleavetype();
		al.enterstartingdate("2024-27-09");
		log.info("Starting Date Entered");
		al.EnterEndDate("2024-30-09");
		log.info("End Date entered");
		al.enterreason("Planned leave");
		log.info("Leave Reason enter");
		al.clickonsubmit();
		
		log.info("LEave Apllied successfully");
		
		


}
}
