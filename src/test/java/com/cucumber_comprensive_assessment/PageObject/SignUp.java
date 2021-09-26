package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cucumber_comprensive_assessment.UiStore.SignUpUi;

public class SignUp {
	
	public WebDriver driver;
	SignUpUi u=new SignUpUi();
	public SignUp(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement trackorder()
	{
		
		return driver.findElement(u.trackorder);
		
	}
	public WebElement loginbutton()
	{
		return driver.findElement(u.loginbutton);
	}
	public WebElement emailaddress()
	{
		return driver.findElement(u.emailaddress);
	}
	public WebElement password()
	{
		return driver.findElement(u.password);
	}
	public WebElement submit()
	{
		return driver.findElement(u.submit);
	}
	public WebElement signup()
	{
		return driver.findElement(u.signup);
	}

}
