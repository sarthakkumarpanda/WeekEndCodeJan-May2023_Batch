package students_assignment;

//Mesbahul Haque Khan

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class makeMyTrip {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 1)
	public void fromTo() throws Exception {
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Rno");
		Thread.sleep(1000);
		int i=0;
		while(i<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Dac");
		Thread.sleep(1000);
		int j=0;
		while(j<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
		
	@Test(priority = 2)
	public void departureReturn() throws Exception {
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Rno");
		Thread.sleep(1000);
		int i=0;
		while(i<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Dac");
		Thread.sleep(1000);
		int j=0;
		while(j<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'DayPicker-Months']")));
		
		String monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
		System.out.println("Current month is : "+ monthYear);
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals("December") && year.equals("2023"))) {
			driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
			monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		driver.findElement(By.cssSelector("div[aria-label='Fri Dec 01 2023'] p")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-cy='returnArea']//label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//p[contains(text(),'31')])[1]")).click();
	}
	
	
	@Test(priority = 3)
	public void travellersClass() throws Exception {
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Rno");
		Thread.sleep(1000);
		int i=0;
		while(i<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Dac");
		Thread.sleep(1000);
		int j=0;
		while(j<1) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'DayPicker-Months']")));
		
		String monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
		System.out.println("Current month is : "+ monthYear);
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals("December") && year.equals("2023"))) {
			driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
			monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		driver.findElement(By.cssSelector("div[aria-label='Fri Dec 01 2023'] p")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-cy='returnArea']//label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(text(),'31')])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class = 'appendRight10']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-cy='adults-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-cy='infants-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Business']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.primaryBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.primaryBtn.font24.latoBold.widgetSearchBtn")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
