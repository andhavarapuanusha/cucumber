package com.cucumber_comprensive_assessment.StepDefination;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.PageObject.Bulk;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationbulk extends DriverClass{
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^intilize driver is done$")
    public void intilize_driver_is_done() throws Throwable {
		
		driver=initilizedriver();
		log.info(driver);
        
    }

    @Then("^url is to be set$")
    public void url_is_to_be_set() throws Throwable {
        
    	ReusableMethods.getURL(driver);
    	log.info("url hitted");
    }

    @Then("^click on bulkorders$")
    public void click_on_bulkorders() throws Throwable {
    	
    	
        Bulk b=new Bulk(driver);
        b.bulkorder().click();
    }

    @Then("^set the driver as null$")
    public void set_the_driver_as_null() throws Throwable {
    	
    	driver.close();
        
    }

    @And("^click on buy bulk$")
    public void click_on_buy_bulk() throws Throwable {
        
    	 Bulk b=new Bulk(driver);
         b.buyinbulk().click();
         
    }


}
