package com.orange.testcases;

import org.testng.annotations.Test;

import com.orange.pageobject.Add_Admin;
import com.orange.pageobject.homepage;
import com.orange.pageobject.loginpage;
import com.orange.utilities.readconfig;

public class TC_Add_New_Admin extends BaseClass {
	
	@Test
	public void addadmin() {
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
		hp.clickonadmin();
		
		Add_Admin adm = new Add_Admin(driver);
		
		adm.clickonaddadmin();
		adm.selectuserrole("0");
		adm.selectemployeename("Jatin Gupta");
		adm.selectuserstatus("Enabled");
		adm.enterusername("Jatin2018");
		adm.enterpassword("J@tin.12345");
		adm.enterpasswordagain("J@tin.12345");
		adm.clickonsave();
		
		
		
	}

}
