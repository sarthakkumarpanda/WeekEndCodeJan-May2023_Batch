package com.automationcode_15thApr_2023;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class RediffListenerLoginTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test(priority = 1)
	public void clickOnSinginLink() {
		driver.findElement(By.className("signin")).click();
	}
	
	@Test(priority = 2, timeOut = 1000)
	public void enterCredentials() throws InterruptedException {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}
	
	@Test(priority = 3, dependsOnMethods = "enterCredentials")
	public void clickOnsigninButton() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}
	
	@Test(priority = 4, enabled = true)
	public void clickOnLogoutLink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
	}
	
	@Test(priority = 5, enabled = false)
	public void clickOnRediffHomeLink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
		
		WebElement rediffHomeLink = driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(rediffHomeLink));
		
		rediffHomeLink.click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
