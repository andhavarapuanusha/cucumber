package com.cucumber_comprensive_assessment.Runner;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	features="src/test/resources",
    glue="com.cucumber_comprensive_assessment.StepDefination",
	monochrome = true)
	public class Runner extends AbstractTestNGCucumberTests /////to run the test with testng we extends this class  AbstractTestNGCucumberTests 
	{
	@AfterSuite
	 public void test() throws IOException
	 { 
		 com.cucumber_comprensive_assessment.Utilities.EmailSender.sentEmail();
	 }
	}



