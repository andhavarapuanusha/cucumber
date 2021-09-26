package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.UiStore.popularproductUi;




public class Popularproduct {
	
	public WebDriver driver;
	popularproductUi u=new popularproductUi();
	public Popularproduct(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement aboutus()
	{
		return driver.findElement(u.aboutus);
	}
	public WebElement textreading()
	{
		return driver.findElement(u.textreading);
	}
	

}
