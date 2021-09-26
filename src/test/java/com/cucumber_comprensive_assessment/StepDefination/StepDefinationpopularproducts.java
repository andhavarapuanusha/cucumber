package com.cucumber_comprensive_assessment.StepDefination;




import org.apache.log4j.Logger;

import com.cucumber_comprensive_assessment.PageObject.Popularproduct;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinationpopularproducts extends DriverClass {
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^driver gets intilized$")
    public void driver_gets_intilized() throws Throwable {
		driver=initilizedriver();
		log.info("driver gets intilized");
    }

    @Then("^send the url to browser$")
    public void send_the_url_to_browser() throws Throwable {
    	ReusableMethods.getURL(driver);
    	log.info("send the url to browser");
    }

    @Then("^click on about us$")
    public void click_on_about_us() throws Throwable {
    	
    	
    	Popularproduct p=new Popularproduct(driver);
    	p.aboutus().click();
    	log.info("clicked on about us");
    	
        
    }

    @Then("^read the text from the page$")
    public void read_the_text_from_the_page() throws Throwable {
    	
    	Popularproduct p=new Popularproduct(driver);
    	String s=p.textreading().getText();
    	System.out.println(s);
    	log.info("reading the text from aboutus page");
    	
    	
       
    }

    @And("^exit the driver$")
    public void exit_the_driver() throws Throwable {
    	
    	driver.close();
    	log.info("driver closed");
        
    }


}
