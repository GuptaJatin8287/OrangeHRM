package com.orange.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orange.utilities.readconfig;



public class BaseClass {
	readconfig read = new readconfig();
	String username = read.getusername();
	String password = read.getpassword();
	String browser = read.getbrowser();
	
	public static WebDriver driver;
	public static Logger log;
	
	@BeforeClass
	public void setup() {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		case "edge":
			driver = new EdgeDriver();
			break;
		default :
			System.out.println("Enter wrong browser value");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//For Logging
		log = LogManager.getLogger("OrangeHRM_Actions");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		
	}
	
	//To take Screenshot
	public void takescreenshot(WebDriver driver, String testname) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("C://Rest-Assured-API//OrangeHRM_Website_Actions//OrangeHRM_Actions//Screenshot//"+testname+".png");
		FileUtils.copyFile(scr, des);
	}
	
	
	@AfterClass(enabled = false)
	public void teardown() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

}
