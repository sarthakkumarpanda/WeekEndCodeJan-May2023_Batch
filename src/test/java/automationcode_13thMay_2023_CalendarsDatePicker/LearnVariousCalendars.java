package automationcode_13thMay_2023_CalendarsDatePicker;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnVariousCalendars {

	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@Test(priority = 1)
	public void part1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
	//	selectDateCalendar("31", "May", "2026");
		
	}
	
	
	public void selectDateCalendar(String calendarDay, String calendarMonth, String calendarYear, String arialabelDate) {
		// February month cannot have more than 29 days

		if (calendarMonth.equals("February") && Integer.parseInt(calendarDay) > 29) {
			System.out.println("Invalid Date because of Feb Month violation");
			return;
		}

		// Other months cannot have more than 31 days
		if (Integer.parseInt(calendarDay) > 31) {
			System.out.println("Invalid date because of other months violation");
			return;
		}
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("Current month is : " + monthYear);

		// you want to chose Dec 25, 2025
		// Month year - suppose this is a String.
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(calendarMonth) && year.equals(calendarYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}

//String dynamicXpath = "//td[@data-handler = 'selectDay']/a[text() = \'" + calendarDay + "\']";
 String dXpathDep = "//div[@class = 'DayPicker-Day'][@aria-label = \'" + arialabelDate + "\']"
 		+ "/child::div[@class = 'dateInnerCell']/child::p[text() = \'"+ calendarDay + "\']";
 
 String rXpathDep = "//div[@class = 'DayPicker-Day'][@aria-label = \'" + arialabelDate + "\']"
	 		+ "/child::div[@class = 'dateInnerCell']/child::p[text() = \'"+ calendarDay + "\']";
		try {
			driver.findElement(By.xpath(dXpathDep)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(rXpathDep)).click();
		} catch (Exception e) {
			System.out.println("Invalid Date " + calendarDay + "/" + calendarMonth + "/" + calendarYear);
		}
	}
	
	public void dateTimeStamp() {
		Date date = new Date();
		
	}
	
	@Test(priority = 2)
	public void part2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('datepicker').value='25/12/2026'");
	}
}
