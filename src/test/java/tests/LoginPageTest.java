package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;

public class LoginPageTest extends Base{
	
	public LoginPage lgn;
	
	LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void SetUp() {
		launchBrowser();
		lgn=new LoginPage();
		
	}
	@Test
	public void logins() throws Exception {
		lgn.looogggiiinnsss();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
