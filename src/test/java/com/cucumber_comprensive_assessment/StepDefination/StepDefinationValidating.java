package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;


import com.cucumber_comprensive_assessment.PageObject.Validation;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationValidating extends DriverClass {
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^driver intilization$")
    public void driver_intilization() throws Throwable {
		driver=initilizedriver();
		log.info(driver);
        
    }

	@Then("^url sending to browser$")
    public void url_sending_to_browser() throws Throwable {
    	
    	ReusableMethods.getURL(driver);
    	log.info("url intilized");
       
    }

    @Then("^click on all nav items$")
    public void click_on_all_nav_items() throws Throwable {
    	
    	Validation v=new Validation(driver);
    	v.nav1().click();
    	v.nav2().click();
    	v.nav3().click();
    	
        log.info("clciked on living room");
    }

    @And("^close the driver set it to null$")
    public void close_the_driver_set_it_to_null() throws Throwable {
    	
    	driver.close();
      
    }


}
