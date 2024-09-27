package com.orange.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	public homepage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Leave']")
	WebElement leave;
	
	
	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	WebElement adminbutton;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	WebElement pim;
	
	public void clickonpim() {
		pim.click();
	}
	
	public void clickonadmin() {
		adminbutton.click();
	}
	
	public void clickonleave( ) {
		leave.click();
	}

}
