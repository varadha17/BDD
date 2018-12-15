package com.stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginPageVerify {
	
	public static WebDriver driver;
	
	@Given("^check the Main page title$")
	public void check_the_Main_page_title() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\sel chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	
		
		String s = driver.getTitle();

		System.out.println(s);
	
	}

	@When("^check the Main page url$")
	public void check_the_Main_page_url() throws Throwable {
	  
	String s1 = driver.getCurrentUrl();
	
	System.out.println(s1);
		
		
		
	}

	@When("^read whether the image is displayed or not$")
	public void read_whether_the_image_is_displayed_or_not() throws Throwable {

	boolean b =	driver.findElement(By.id("hplogo")).isDisplayed();
		
	System.out.println(b);
		
		
		
	}

	@Then("^click the gmail link$")
	public void click_the_gmail_link() throws Throwable {
	
		driver.findElement(By.linkText("Gmail")).click();
		
		
		
	}

	@Then("^click the Images link$")
	public void click_the_Images_link() throws Throwable {

		String s2 = driver.getTitle();
		
		System.out.println(s2);
		
		driver.close();
		
		
	}


	
	
	
	
	
	

}
