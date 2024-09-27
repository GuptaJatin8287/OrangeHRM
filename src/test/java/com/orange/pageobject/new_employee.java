package com.orange.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class new_employee {

	public WebDriver driver;
	
	public new_employee(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addbutton;
	public void addemplyeebutton() {
		addbutton.click();
	}
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	WebElement firstname;
	public void enterfirstname(String firstname1) {
		firstname.clear();
		firstname.sendKeys(firstname1);
	}
	
	@FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]")
	WebElement middlename;
	public void entermiddlename(String middlename1) {
		middlename.clear();
		middlename.sendKeys(middlename1);
	}
	
	@FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active orangehrm-lastname\"]")
	WebElement lastname;
	public void enterlastname(String lastname1)
{
		lastname.clear();
		lastname.sendKeys(lastname1);
	}
	
	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement employeeid;
	public void enteremployeeid(String id) {
		employeeid.clear();
		employeeid.sendKeys(id);
		}
	
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	WebElement savebutton;
	public void clickonsave() {
		savebutton.click();
	}
	
	
}
