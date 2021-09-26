package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.cucumber_comprensive_assessment.UiStore.LoginUi;

public class Login {
	
	public WebDriver driver;
	LoginUi u=new LoginUi();
	public Login(WebDriver driver)
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
	
	
	
	

}
