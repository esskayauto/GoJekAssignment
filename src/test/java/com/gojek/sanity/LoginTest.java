package com.gojek.sanity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gojek.pom.ClearTripHomePage;

public class LoginTest extends BaseTest {

	/*@Test(priority = 1)
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

	}*/

	@Test(priority = 2)
	public void searchFlight() throws InterruptedException {

		driver.findElement(By.id("RoundTrip")).click();

		driver.findElement(By.id("FromTag")).sendKeys("Banga");
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("ToTag")).sendKeys("New Delhi, IN");
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("DepartDate")).click();
		
		
		driver.findElement(By.linkText("12")).click();
	/*	
		List<WebElement> deptDate = driver.findElements(By.xpath("//table[@class='calendar']//td"));
		
		for(WebElement ele :deptDate ){
			String date=ele.getText();
			{
				if(date.equalsIgnoreCase("12"))
				{
					ele.click();
				}
			}
		}
		*/
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("24")).click();

		//driver.findElement(By.id("DepartDate")).sendKeys(Keys.ENTER);;;
		//driver.findElement(By.id("DepartDate")).sendKeys(Keys.TAB);;

		
		//List<WebElement> returnDate = driver.findElements(By.id("ui-datepicker-div"));
		
		/*for(WebElement ele :deptDate ){
			String date=ele.getText();
			{
				if(date.equalsIgnoreCase("15"))
				{
					ele.click();
				}
			}
		}
		driver.findElement(By.id("ReturnDate")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);*/
		
		Thread.sleep(3000);

		driver.findElement(By.id("SearchBtn")).click();

	}

	@Test(priority = 3)
	public void bookFlight() throws InterruptedException {

		// Book A Flight
		
		Thread.sleep(3000);   
		
		

		Actions action = new Actions(driver);
		WebElement mouse = driver.findElement(By.xpath("//*[@id='flightForm']/section[2]/div[3]/div[3]/button"));
		action.moveToElement(mouse).build().perform();

		
		
	}

	@Test(priority = 4)
	public void travellersDetail() {

		WebElement selectElement = driver.findElement(By.id("AdultTitle1"));

		Select select1 = new Select(selectElement);
		select1.selectByVisibleText("Mr");
		driver.findElement(By.id("AdultFname1")).sendKeys("Kiran ");
		driver.findElement(By.id("AdultLname1")).sendKeys("SK");
		// Date of Birth

		WebElement selectDate = driver.findElement(By.id("AdultDobDay1"));

		Select select2 = new Select(selectElement);
		select2.selectByVisibleText("9");

		// Month

		WebElement selectMonth = driver.findElement(By.id("AdultDobMonth1"));

		Select select3 = new Select(selectElement);
		select3.selectByVisibleText("Jan");

		// Nationality

		driver.findElement(By.id("intADDAD1")).sendKeys("India");
		driver.findElement(By.id("intADDAD1")).sendKeys(Keys.ENTER);

		//

	}

	@Test(priority =5)
	public void paymentDetails()

	{

		// Net Banking

		WebElement toElement = driver.findElement(By.xpath("//a[contains(text(), 'Net Banking')]"));
		Actions action = new Actions(driver);
		action.moveToElement(toElement).build().perform();

		// Click on ICICI Bank

		driver.findElement(By.id("icici_bank")).click();

		// Submi the Payment

		// d="paymentSubmit"
		driver.findElement(By.id("paymentSubmit")).click();
	}
}
