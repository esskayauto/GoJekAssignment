package com.gojek.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPage 
{
	
	@FindBy(id ="RoundTrip")
	private WebElement roundTrip;
	private WebDriver driver;
		
	public SearchFlightPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void roundTrip()
	{
		
		roundTrip.click();
	}
	

}
