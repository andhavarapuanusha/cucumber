package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.UiStore.LandingPageUi;

public class LandingPage {
	
	public WebDriver driver;
	LandingPageUi u=new LandingPageUi();
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement search()
	{
		return driver.findElement(u.search);
		
	}
	
	
}


