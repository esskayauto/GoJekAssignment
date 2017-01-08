package com.gojek.sanity;

import org.testng.annotations.Test;

import com.gojek.pom.SearchFlightPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchAFlight extends BaseTest

{
	
	@Test(priority =2)
	public void searchFlight()
	{
		
		
		
		
	SearchFlightPage	search = new SearchFlightPage(driver);
	
	
	search.roundTrip();
		/*driver.findElement(By.id("RoundTrip")).click();
		
		
		driver.findElement(By.id("FromTag")).sendKeys("Banga");
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		
	
		driver.findElement(By.id("ToTag")).sendKeys("New Delhi, IN");
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.id("DepartDate")).click();
		
		
		driver.findElement(By.id("DepartDate")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("ReturnDate")).click();
		
		driver.findElement(By.id("ReturnDate")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("SearchBtn")).click();
		*/
	
		
		
	}

}
