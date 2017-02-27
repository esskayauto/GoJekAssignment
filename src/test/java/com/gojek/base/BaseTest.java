package com.gojek.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.gojek.config.ProjectConfig;




public class BaseTest 

{
	
	public WebDriver driver;

	@BeforeSuite
	public void preCondition() {
		
		System.setProperty("webdriver.chrome.driver", ProjectConfig.CHROME_DRIVER_PATH);

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(ProjectConfig.URL);

		// Wait for main page to be displayed
		try {

			new WebDriverWait(driver, 30)
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fl logo']")));

		} catch (WebDriverException e) {

			e.printStackTrace();
			Assert.fail("Page is not loaded properly. Skipping the test!");

		}


	}

	@AfterSuite
	public void postCondition() {
		if (driver != null) {
			driver.quit();
		}
	}

}
