package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;
import com.cucumber_comprensive_assessment.PageObject.Cart;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationcart extends DriverClass{
	
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^driver is intilized$")
    public void driver_is_intilized() throws Throwable {
		driver=initilizedriver();
		log.info("driver intilized");
    }

    @Then("^hit url$")
    public void hit_url() throws Throwable {
    	ReusableMethods.getURL(driver);
    	log.info("url hitted");
    }
    @Then("^click on cart$")
    public void click_on_cart() throws Throwable {
    	
    	
    	
    	Cart c=new Cart(driver);
    	c.cart().click();
        log.info("clicked on cart");
    }
    @Then("^click on continue shopping button$")
    public void click_on_continue_shopping_button() throws Throwable {
    	Cart c=new Cart(driver);
    	c.continuebutton().click();
    	log.info("clicked on continue button");
    }
    @And("^change driver to close state$")
    public void change_driver_to_close_state() throws Throwable {
        driver.close();
        log.info("driver closed");
    }



}
