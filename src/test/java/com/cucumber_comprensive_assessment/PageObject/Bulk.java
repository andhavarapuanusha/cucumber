package com.cucumber_comprensive_assessment.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.UiStore.BulkUi;

public class Bulk {
	
	
	BulkUi b=new BulkUi();
	public WebDriver driver;
	
	public Bulk(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement bulkorder()
	{
		return driver.findElement(b.bulkorder);
		
	}
	public WebElement buyinbulk()
	{
		return driver.findElement(b.buyinbulk);
		
	}
	

}
