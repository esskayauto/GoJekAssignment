package com.gojek.sanity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest 

{
	
	public WebDriver driver;

	@BeforeSuite
	public void preCondition() {
		// System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		// driver=new HtmlUnitDriver();

		driver = new FirefoxDriver();

		// driver = new ChromeDriver();
		String xlPath = "./excel/PRODMasterLibrary.xlsx";
		String Sheet = "Sheet1";
		
		String url ="https://www.cleartrip.com/";
		
	//	String url = Excel.getCellValue(xlPath, Sheet, 1, 1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

	}

	@AfterSuite
	public void postCondition() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.quit();
	}

}
