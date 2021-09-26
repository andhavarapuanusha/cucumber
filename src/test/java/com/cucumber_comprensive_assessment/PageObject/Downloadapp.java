package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.UiStore.DownloadappUi;


public class Downloadapp {
	
	public WebDriver driver;
	DownloadappUi u=new DownloadappUi();
	public Downloadapp(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement app()
	{
		return driver.findElement(u.app);
		
	}
	public WebElement rateing()
	{
		return driver.findElement(u.rating);
		
	}

}
