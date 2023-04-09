package com.testngcode_8thApr_2023;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize_Rediff {
	//what is parameterization ?
	//using different set of input parameters to determine the output of the same logic
	
	//Browser, url, username, password - these are the parameters that I want to parameterize
	
public WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "username", "password"})
	public void rediffLogin(String Browser, String url, String username, String password) {
		
		if(Browser.equals("chrome")) {
			driver = new ChromeDriver();	
		}else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
