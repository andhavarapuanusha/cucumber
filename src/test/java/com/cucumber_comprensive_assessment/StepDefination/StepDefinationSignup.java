package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;

import com.cucumber_comprensive_assessment.PageObject.SignUp;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationSignup  extends DriverClass{
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^setting driver$")
    public void setting_driver() throws Throwable {
		driver=initilizedriver();
		log.info(driver);
    }

    @Then("^setting the url;$")
    public void setting_the_url() throws Throwable {
    	ReusableMethods.getURL(driver);
    	log.info("url intilized");
    }

    @Then("^tab on trackorder$")
    public void tab_on_trackorder() throws Throwable {
    	SignUp s=new SignUp(driver);
    	s.trackorder().click();
    	log.info("clicked on track order");
    			
        
    }

    @Then("^tab on signup$")
    public void tab_on_signup() throws Throwable {
    	
    	SignUp s=new SignUp(driver);
    	s.signup().click();
    	log.info("clciked on signup link");
        
    }

    @Then("^send the email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void send_the_email_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
        
    	SignUp s=new SignUp(driver);
    	s.emailaddress().click();
    	s.emailaddress().sendKeys(strArg1);
    	s.password().click();
    	s.password().sendKeys(strArg2);
    	log.info("sended email and password");
  
    }

    @Then("^closing the driver$")
    public void closing_the_driver() throws Throwable {
    	driver.close();
    	log.info("closing browser");
    }

    @And("^tab on loginbutton$")
    public void tab_on_loginbutton() throws Throwable {
    	SignUp s=new SignUp(driver);
    	s.loginbutton().click();
    	log.info("clicked on login button");
        
    }

    @And("^tab on submit button$")
    public void tab_on_submit_button() throws Throwable {
    	SignUp s=new SignUp(driver);
    	s.submit().click();
    	log.info("clciked on submit button");
    }

}
