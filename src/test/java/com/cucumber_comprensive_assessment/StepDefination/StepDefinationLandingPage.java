package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;

import com.cucumber_comprensive_assessment.PageObject.LandingPage;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationLandingPage extends DriverClass {
	   Logger log=Logger.getLogger(DriverClass.class);
       @Given("^intilize the browser$")
	    public void intilize_the_browser() throws Throwable {
	    	driver=initilizedriver();
	    	log.info("driver intilized");
	        
	    }

	    @When("^navigate to furniture website$")
	    public void navigate_to_furniture_website() throws Throwable {
	    	ReusableMethods.getURL(driver);
	    	log.info("navigated to website");
	        
	    }


	    @Then("^click on search tab and give the (.+)$")
	    public void click_on_search_tab_and_give_the(String products) throws Throwable {
	    	LandingPage l=new LandingPage(driver);
	    	l.search().click();
	    	l.search().sendKeys(products);
	    	l.search().sendKeys(Keys.ENTER);
	    	log.info("searched");
	    	
	        
	    }

	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable 
	    {
	    	
	    	driver.close();
	        
	    }

	    

}
