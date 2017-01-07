package com.gojek.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearTripHomePage 

{
	@FindBy(id = "userAccountLink")
	private WebElement userAccount;
	
	@FindBy(id = "SignIn")
	private WebElement signIn;

	@FindBy(id = "email")
	private WebElement email;
	
	
	@FindBy(id = "password")
	private WebElement passWord;
	
	//signInButton
	
	@FindBy(id = "signInButton")
	private WebElement signInButton;

	private WebDriver driver;

	public ClearTripHomePage(WebDriver driver) {
		this.driver = driver;

	PageFactory.initElements(driver, this);
	}

	public void userAccountClick() {
		userAccount.click();
	}

	public void signInClick() {
		signIn.click();
	}

	public void enterMailID(String mailID) {
		
		email.sendKeys(mailID);
	
	}
	

	public void enterPassword(String password) {
		
		passWord.sendKeys(password);
	
	}
	public void signInButtonClick() {
		signInButton.click();
	}

}
