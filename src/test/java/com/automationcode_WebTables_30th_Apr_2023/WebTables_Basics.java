package com.automationcode_WebTables_30th_Apr_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables_Basics {

	public WebDriver driver;

	@Test
	public void webTableLearing() {
		String companyName = "Yug Decor";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> names = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));

		List<WebElement> prices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));

		System.out.println(names.size() + "----" + prices.size());

		// print names of all the companies along with their current prices
		//print a specific company name and it's corresponding current price
		for (int i = 0; i < names.size(); i++) {
			if (companyName.equals(names.get(i).getText())) {
				System.out.println(names.get(i).getText() + "------------" + prices.get(i).getText());
				break;
			}
		}
	}
}
