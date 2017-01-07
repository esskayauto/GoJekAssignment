package com.gojek.sanity;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.gojek.pom.ClearTripHomePage;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {

		ClearTripHomePage homePage = new ClearTripHomePage(driver);
		homePage.userAccountClick();
		homePage.signInClick();
		
		driver.findElement(By.id("email")).sendKeys("iamkiransk@gmail.com");
		//homePage.enterMailID("iamkiransk@gmail.com");
		homePage.enterPassword("gojek123");
		homePage.signInButtonClick();
		
		
		
	}

}
