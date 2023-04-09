package com.automationcode_Applying_Inheritance_9thApr_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase { //this one will act as the Parent Class for all the other Test Cases
	
	
	public static WebDriver driver;
	
	public static void openBrowserAndApplication() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("http://tutorialsninja.com/demo");
	}

}
