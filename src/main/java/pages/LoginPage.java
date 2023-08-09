package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath = "//span[@class=\"caret\"]")
	WebElement dropdown;
	
	@FindBy(xpath = "//a[normalize-space()=\"Login\"]")
	WebElement loginbtn;
	
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement email;
	
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	WebElement password;
	
	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	WebElement lgnbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage looogggiiinnsss() throws Exception {
		dropdown.click();
		loginbtn.click();
		Thread.sleep(2000);
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		lgnbtn.click();
		Thread.sleep(4000);
		
		return new HomePage();
		
	}

}
