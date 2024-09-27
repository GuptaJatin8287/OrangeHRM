package com.orange.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Admin {
	WebDriver driver;
	public Add_Admin(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement Admin;
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	WebElement userrole;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	WebElement employeename;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	WebElement userstatus;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement username1;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement password1;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	
	
	public void clickonaddadmin() {
		Admin.click();
	}
	public void selectuserrole(String user) {
		Select sc = new Select(userrole);
		sc.selectByVisibleText(user);
	}
	
	public void selectemployeename(String empname) {
		employeename.sendKeys(empname);
	}
	public void selectuserstatus(String status) {
		Select sc = new Select(userstatus);
		sc.deselectByIndex(0);;
	}
	public void enterpassword(String password) {
		password1.sendKeys(password);
	}
	public void enterusername(String username) {
		username1.sendKeys(username);
	}
	public void enterpasswordagain(String password2) {
		confirmpassword.sendKeys(password2);
	}
	public void clickonsave() {
		save.click();
	}
	

}
