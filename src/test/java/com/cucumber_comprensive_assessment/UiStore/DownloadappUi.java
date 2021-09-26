package com.cucumber_comprensive_assessment.UiStore;

import org.openqa.selenium.By;

public class DownloadappUi {
	
	public By app=By.xpath("//a[@href='https://play.google.com/store/apps/details?id=com.urbanladder.catalog']");
    //public By rating=By.xpath("//div[@aria-label='Rated 4.0 stars out of five stars'][1]");
	public By rating=By.xpath("//span[text()='Payment methods']");
}
