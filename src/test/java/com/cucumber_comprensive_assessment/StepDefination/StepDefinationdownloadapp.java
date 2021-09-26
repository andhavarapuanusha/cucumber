package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;


import com.cucumber_comprensive_assessment.PageObject.Downloadapp;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationdownloadapp extends DriverClass{
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^driver$")
    public void driver() throws Throwable {
		driver=initilizedriver();
    	log.info("driver intilized");
    }

    @Then("^url$")
    public void url() throws Throwable {
    	ReusableMethods.getURL(driver);
    	log.info("navigated to website");
    }

    @Then("^click on appstore$")
    public void click_on_appstore() throws Throwable {
        
    	Downloadapp d=new Downloadapp(driver);
    	d.app().click();
    	
    }

    @Then("^close$")
    public void close() throws Throwable {
        driver.close();
    }

    @And("^read the rating$")
    public void read_the_rating() throws Throwable {
    	
    	Downloadapp d=new Downloadapp(driver);
    	//System.out.println(d.rateing().getText());
    	//d.rateing().click();
    }

}
