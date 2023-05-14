package com.filehandling_8thApr_2023;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Reading_From_Properties_File {
	
	public WebDriver driver;
	
	@Test(priority = 1)
	public void TNLogin() throws Exception {
		//Step 1 - Create the Object of Properties class
		//Step 2 - Create the Object of FileInputStream class
	//	C:\Users\sarth\eclipse-workspace\WEEKEND_AUTOMATION_CODE\src\test\java\com\filehandling_8thApr_2023\tutorialsninja.properties
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("The common path which can be universal is : " + System.getProperty("user.dir"));
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\filehandling_8thApr_2023\\TN_Rediff.properties");
		prop.load(ip);
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validUsername"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(priority = 2)
	public void rediffLogin() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("The common path which can be universal is : " + System.getProperty("user.dir"));
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\filehandling_8thApr_2023\\TN_Rediff.properties");
		prop.load(ip);
		
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("validRUsername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validRPassword"));
		driver.findElement(By.cssSelector("input.signinbtn")).click();	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
