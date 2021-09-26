package com.cucumber_comprensive_assessment.StepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.cucumber_comprensive_assessment.PageObject.Payment;
import com.cucumber_comprensive_assessment.ReusableMethods.DriverClass;
import com.cucumber_comprensive_assessment.ReusableMethods.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationpayment extends DriverClass{
	
	Logger log=Logger.getLogger(DriverClass.class);
	@When("^first we intilize driver$")
    public void first_we_intilize_driver() throws Throwable {
       
		driver=initilizedriver();
		log.info("driver gets intilized");
    }

    @Then("^we should send url$")
    public void we_should_send_url() throws Throwable {
    	
    	ReusableMethods.getURL(driver);
    	log.info("send the url to browser");
        
    }

    @Then("^read all the payment modes$")
    public void read_all_the_payment_modes() throws Throwable {
        
    	
    	Payment p=new Payment(driver);
    	//WebElement image = driver.findElement(By.xpath("//img[@src='https://www.ulcdn.net/assets/spree/frontend/weAccept/maestro-color-aa7cd4624473b4ec8a4c383b5ba664b2.png']"));
      	//System.out.println("The image alt is : "+image.getAttribute("alt"))
    	WebElement img1=p.img1();
    	System.out.println("The image alt is : "+img1.getAttribute("alt"));
    	WebElement img2=p.img2();
    	System.out.println("The image alt is : "+img2.getAttribute("alt"));
    	WebElement img3=p.img3();
    	System.out.println("The image alt is : "+img3.getAttribute("alt"));
    	WebElement img4=p.img4();
    	System.out.println("The image alt is : "+img4.getAttribute("alt"));
    	WebElement img5=p.img5();
    	System.out.println("The image alt is : "+img5.getAttribute("alt"));
    	
    	log.info("read all the payment modes is done");
    }

    @And("^shut down the driver$")
    public void shut_down_the_driver() throws Throwable {
    	
    	driver.close();
        
    }


}
