package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	//HomePage  homePage;
	//ogger log = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		
		initialization();
	
		loginPage = new LoginPage();
	
	}
	
	@Test(priority =1)
	public void loginTest() {
		
		loginPageTitleTest();
		
		loginPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		}
	
	
	public void loginPageTitleTest() {
		
	
		String title = loginPage.validationLoginPageTitle();
		
		Assert.assertEquals(title, "Eclair Track - Connexion");
		
	}

	

	
//	@AfterMethod
//    public void tearDown() {
//		
//		driver.quit();
//	}

}
