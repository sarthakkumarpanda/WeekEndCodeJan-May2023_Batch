package com.filehandling_creation_validatation_ExcelSheet_8th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TN_Register_Validate {
	
public WebDriver driver;
	
	@Test(priority = 1, dataProvider = "TN", dataProviderClass = ExcelData_DataProvider.class)
	public void tnRegister(String firstname, String lastname, String email, String telephone, String password, String confirmpassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
