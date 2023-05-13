package automation_extra_topics_May6th_7th;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Headless_Mode {

	public WebDriver driver;
	public ChromeOptions options;

	@Test(priority = 1)
	public void chromeBrowserHeadlessMode() throws Exception {
		options = new ChromeOptions();
		options.addArguments("headless");
		// options.setHeadless(true);
		options.addArguments("--no-sandbox");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

		driver.quit();
	}

	@Test(priority = 2)
	public void firefoxBrowserHeadlessMode() throws Exception {
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		options.addArguments("--disable-gpu");
		options.setAcceptInsecureCerts(true);
		options.addArguments("--headless");
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());

		driver.quit();
	}

}
