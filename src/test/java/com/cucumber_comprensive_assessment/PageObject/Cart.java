package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.UiStore.CartUi;


public class Cart {
	
	public WebDriver driver;
	CartUi u=new CartUi();
	public Cart(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement cart()
	{
		return driver.findElement(u.cartbadge);
	}
	public WebElement continuebutton()
	{
		return driver.findElement(u.continuebutton);
	}
	
}
