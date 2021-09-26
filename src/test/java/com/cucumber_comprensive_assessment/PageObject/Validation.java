package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.cucumber_comprensive_assessment.UiStore.ValidationUi;

public class Validation {
	
	public WebDriver driver;
	ValidationUi u=new ValidationUi();
	public Validation(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement nav1()
	{
		
		return driver.findElement(u.nav1);
		
	}
	public WebElement nav2()
	{
		return driver.findElement(u.nav2);
	}
	public WebElement nav3()
	{
		return driver.findElement(u.nav3);
	}
	


}
