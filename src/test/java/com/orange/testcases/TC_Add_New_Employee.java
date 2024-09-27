package com.orange.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.orange.pageobject.homepage;
import com.orange.pageobject.loginpage;
import com.orange.pageobject.new_employee;
import com.orange.utilities.readconfig;

public class TC_Add_New_Employee extends BaseClass {
	@Test
	public void addemployee() throws IOException {
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
		hp.clickonpim();
		log.info("Clicked on pim button");
		new_employee ep = new new_employee(driver);
		ep.addemplyeebutton();
		ep.enterfirstname("Jatin");
		ep.entermiddlename("Kumar");
		ep.enterlastname("Gupta");
		ep.enteremployeeid("4432");
		takescreenshot(driver, "employee_Data");
		ep.clickonsave();
	}

}
