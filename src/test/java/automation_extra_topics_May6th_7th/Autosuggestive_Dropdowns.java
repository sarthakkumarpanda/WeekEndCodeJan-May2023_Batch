package automation_extra_topics_May6th_7th;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestive_Dropdowns {
	// Travel websites

	public WebDriver driver;

	@Test(priority = 1)
	public void makeMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Was");
		Thread.sleep(2000);
		int i = 0;
		while (i < 4) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("New");
		int j = 0;
		while (j < 4) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);

	}

	@Test(priority = 2)
	public void easeMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.us/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("frmcity")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'a_FromSector_show']")).sendKeys("New");
		Thread.sleep(2000);
		driver.findElement(By.id("spnNew Haven")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tocity")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'a_Editbox13_show']")).sendKeys("Bos");
		Thread.sleep(2000);
		driver.findElement(By.id("spnBosset")).click();

	}

}
