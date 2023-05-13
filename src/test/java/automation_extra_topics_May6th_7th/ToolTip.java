package automation_extra_topics_May6th_7th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {
	
	public WebDriver driver;
	
	@Test
	public void determineToolTip() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
		String toolTipValue = moneyLink.getAttribute("title");
		System.out.println("The tool tip for money link is : " + toolTipValue);
		
		WebElement BusinessEmailLink = driver.findElement(By.linkText("Business Email"));
		String toolTipValue1 = BusinessEmailLink.getAttribute("title");
		System.out.println("The tool tip for business link is : " + toolTipValue1);
		
		WebElement VideosLink = driver.findElement(By.linkText("Videos"));
		String toolTipValue2 = VideosLink.getAttribute("title");
		System.out.println("The tool tip for videos link is : " + toolTipValue2);
		
		WebElement ShoppingLink = driver.findElement(By.linkText("Shopping"));
		String toolTipValue3 = ShoppingLink.getAttribute("title");
		System.out.println("The tool tip for shopping link is : " + toolTipValue3);
		
		WebElement CreateAccountLink = driver.findElement(By.linkText("Create Account"));
		String toolTipValue4 = CreateAccountLink.getAttribute("title");
		System.out.println("The tool tip for create Account link is : " + toolTipValue);
		
		driver.quit();
		
	}

}
