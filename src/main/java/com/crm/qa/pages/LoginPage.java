package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath = "//button[contains(.,'connexion')]")
	WebElement signBtn;
	

	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validationLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public void setUserName(String strUserName){

		username.sendKeys(strUserName);     
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

    	password.sendKeys(strPassword);

    }
	public LoginPage login(String strUserName, String strPassword) {
		
		this.setUserName(strUserName);
		this.setPassword(strPassword);
//		email.sendKeys(us);
//		password.sendKeys(pwd);
		signBtn.click();
		
		return new LoginPage();
		
	}
}
