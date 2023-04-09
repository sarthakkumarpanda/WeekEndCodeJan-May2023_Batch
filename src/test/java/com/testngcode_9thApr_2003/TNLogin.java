package com.testngcode_9thApr_2003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TNLogin {
	
	public WebDriver driver;
	
	@Test(dataProvider = "TN", dataProviderClass = DataProvider_TN.class)
	public void TNLoginChromeTest(String username, String password){
		System.out.println("The thread for this is : " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();

	}
	
	@Test(dataProvider = "TN", dataProviderClass = DataProvider_TN.class)
	public void TNLoginFirefoxTest(String username, String password){
		System.out.println("The thread for this is : " + Thread.currentThread().getId());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();

	}
	
	@Test(dataProvider = "TN", dataProviderClass = DataProvider_TN.class)
	public void TNLoginEdgeTest(String username, String password){
		System.out.println("The thread for this is : " + Thread.currentThread().getId());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();

	}



}



