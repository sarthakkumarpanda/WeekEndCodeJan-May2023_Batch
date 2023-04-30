package com.automationcode_ScreenRecoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffScreenRecord_Code {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception {
		ScreenRecorderUtil.startRecord("setup");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		ScreenRecorderUtil.stopRecord();
	}

}
