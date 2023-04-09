package com.automationcode_Applying_Inheritance_9thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProductTest extends TestBase{
	
public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		TestBase.openBrowserAndApplication();
		
			
	}
	
	@Test(priority = 1)
	public void validProductSearchTest() {
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority = 2)
	public void invalidProductSearchTest() {
		driver.findElement(By.name("search")).sendKeys("DELL");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'There is no product that matches the search criteria.')]")).isDisplayed());
		softassert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
