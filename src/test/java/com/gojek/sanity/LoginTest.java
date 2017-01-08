package com.gojek.sanity;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.gojek.pom.ClearTripHomePage;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {

		ClearTripHomePage homePage = new ClearTripHomePage(driver);
		homePage.userAccountClick();
		homePage.signInClick();
		Thread.sleep(3000);
		WebElement frameElement = driver.findElement(By.id("modal_window"));
		driver.switchTo().frame(frameElement);

		driver.findElement(By.id("email")).sendKeys("iamkiransk@gmail.com");
		// homePage.enterMailID("iamkiransk@gmail.com");
		homePage.enterPassword("gojek123");
		homePage.signInButtonClick();

	}
/*
	@Test(priority = 2)
	public void searchFlight() {

		driver.findElement(By.id("RoundTrip")).click();

		driver.findElement(By.id("FromTag")).sendKeys("Banga");
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("ToTag")).sendKeys("New Delhi, IN");
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("DepartDate")).click();

		driver.findElement(By.id("DepartDate")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ReturnDate")).click();

		driver.findElement(By.id("ReturnDate")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("SearchBtn")).click();

	}*/

}
