package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.UiStore.PaymentUi;

public class Payment {
	
	public WebDriver driver;
	PaymentUi p=new PaymentUi();
	public Payment(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement img1()
	{
		return driver.findElement(p.img1);
		
	}
	public WebElement img2()
	{
		return driver.findElement(p.img2);
		
	}
	public WebElement img3()
	{
		return driver.findElement(p.img3);
		
	}
	public WebElement img4()
	{
		return driver.findElement(p.img4);
		
	}
	public WebElement img5()
	{
		return driver.findElement(p.img5);
		
	}
	

}
