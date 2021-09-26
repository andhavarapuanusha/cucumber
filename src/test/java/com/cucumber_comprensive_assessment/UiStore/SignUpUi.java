package com.cucumber_comprensive_assessment.UiStore;

import org.openqa.selenium.By;

public class SignUpUi {
	
	public By trackorder=By.linkText("Track Order");
	public By loginbutton=By.xpath("//button[text()='Login To Track All Your Orders']");
	public By signup=By.linkText("Sign-up");
	public By emailaddress=By.xpath("//input[@placeholder='Email Address*']");
	public By password=By.xpath("//input[@class='textfield required input_authentication'][1]");
	public By submit=By.xpath("//input[@type='submit']");

}
