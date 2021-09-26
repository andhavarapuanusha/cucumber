package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;

import com.cucumber_comprensive_assessment.PageObject.Login;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationLogin extends DriverClass {
	    Logger log=Logger.getLogger(DriverClass.class);
	    @When("^driver is set$")
	    public void driver_is_set() throws Throwable {
	    	
	    	driver=initilizedriver();
	    	log.info("intilized driver");
	        
	    }

	    @Then("^send the url$")
	    public void send_the_url() throws Throwable {
	    	ReusableMethods.getURL(driver);
	    	log.info("url hited");
	    }
	
	
	    @Then("^click on tractorder$")
		public void click_on_tractorder() throws Throwable {
				Login l=new Login(driver);
				l.trackorder().click();
				log.info("clicked in trackorder");
		        
             }

	    @Then("^give emailaddress as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	    public void give_emailaddress_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
	    	
	    	Login l=new Login(driver);
	    	l.emailaddress().click();
	    	l.emailaddress().sendKeys(strArg1);
	    	l.password().click();
	    	l.password().sendKeys(strArg2);
	    	log.info("sended email and password");
	    	
	        
	    }

	    @And("^click on login button$")
	    public void click_on_login_button() throws Throwable {
	    	
	    	Login l=new Login(driver);
	    	l.loginbutton().click();
	    	log.info("clciked on login button");
	        
	    }
	
	    @And("^click on submit button$")
	    public void click_on_submit_button() throws Throwable {
	    	
	    	Login l=new Login(driver);
	    	l.submit().click();
	    	log.info("clciked on submit");
	    	
	        
	    }
	    @Then("^close driver tab$")
	    public void close_driver_tab() throws Throwable {
	        driver.close();
	        log.info("driver closed");
	    }

}
