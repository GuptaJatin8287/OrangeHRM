package com.orange.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class loginpage {
	WebDriver driver;
	
	public loginpage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	public void enterusername(String username1) {
		username.sendKeys(username1);
	}
	
	public void enterpassword(String password1) {
		password.sendKeys(password1);
	}
	
	public void clickonsubmit() {
		submit.click();
	}

}
