package com.orange.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class applyLeave {
	WebDriver driver;
	public applyLeave(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement startingdate;
	//(//input[@class='oxd-input oxd-input--active'])[02]
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement enddate;
	
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement reason;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement submitbutton;
	@FindBy(linkText = "Apply")
	WebElement clickapply;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	WebElement leavetype;
	
	public void clickonapplybutton() {
		clickapply.click();
	
	}
	
	public void clickonsubmit() {
		submitbutton.click();
	}
	
	public void enterreason(String reason1) {
		reason.sendKeys(reason1);
	}
	
	
	public void enterstartingdate(String startdate) {

		startingdate.sendKeys(startdate);
	}
	
	public void EnterEndDate(String enddate1) {
		startingdate.sendKeys(Keys.TAB+enddate1);
	}
	
	
	
		
	
	
	//WebElement leavetype = driver.findElement(By.xpath("//*[contains(text(),'CAN')]"));
	
	public void clickonleavetype() {
 	Select sc = new Select(leavetype);
 	sc.selectByIndex(0);
		
	 }
	

}
