package automationcode_14thMay_2023_PracticeCalendars;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MakeMyTrip {

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	public WebDriverWait wait;

	@Test(priority = 1)
	public void addingToAndFromDestinations() throws Exception {
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
	public void addDepartureArrivalDate() throws Exception {
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

		Thread.sleep(2000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("datePickerContainer")));

		Thread.sleep(2000);
		selectDateCalendarDepartureDate("27", "July", "2023");

		Thread.sleep(2000);

		selectDateCalendarArrivalDate("25", "August", "2023");

	}

	public void selectDateCalendarDepartureDate(String calendarDay, String calendarMonth, String calendarYear) {

		if (calendarMonth.equals("February") && Integer.parseInt(calendarDay) > 29) {
			System.out.println("Invalid Date because of Feb Month violation");
			return;
		}

		if (Integer.parseInt(calendarDay) > 31) {
			System.out.println("Invalid date because of other months violation");
			return;
		}

		String monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
		System.out.println("Current month is : " + monthYear);

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(calendarMonth) && year.equals(calendarYear))) {
			driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
			monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		String dXpath = "//div[@class = 'DayPicker-Day'][@aria-label = \'" + dateTimeStamp() + "\']"
				+ "/child::div[@class = 'dateInnerCell']/child::p[text() = \'" + calendarDay + "\']";

		try {
			driver.findElement(By.xpath(dXpath)).click();
		} catch (Exception e) {
			System.out.println("Invalid Date " + calendarDay + "/" + calendarMonth + "/" + calendarYear);
		}
	}

	public void selectDateCalendarArrivalDate(String calendarDay, String calendarMonth, String calendarYear) {

		if (calendarMonth.equals("February") && Integer.parseInt(calendarDay) > 29) {
			System.out.println("Invalid Date because of Feb Month violation");
			return;
		}

		if (Integer.parseInt(calendarDay) > 31) {
			System.out.println("Invalid date because of other months violation");
			return;
		}

		String monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
		System.out.println("Current month is : " + monthYear);

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(calendarMonth) && year.equals(calendarYear))) {
			driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
			monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}

		String rXpath = "//div[@class = 'DayPicker-Day'][@aria-label = \'" + dateTimeStamp() + "\']"
				+ "/child::div[@class = 'dateInnerCell']/child::p[text() = \'" + calendarDay + "\']";

		try {
			driver.findElement(By.xpath(rXpath)).click();
		} catch (Exception e) {
			System.out.println("Invalid Date " + calendarDay + "/" + calendarMonth + "/" + calendarYear);
		}
	}

	public String dateTimeStamp() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd yyyy");
		String formattedDate = formatter.format(date);
		return formattedDate;
	}

}
