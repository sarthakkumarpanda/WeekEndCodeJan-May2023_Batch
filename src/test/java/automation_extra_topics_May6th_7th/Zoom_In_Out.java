package automation_extra_topics_May6th_7th;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zoom_In_Out {
	public WebDriver driver;
	
	@Test
	public void zoom() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		//Zoom in
		js.executeScript("document.body.style.zoom = '400%' ; ");
		
		Thread.sleep(2000);
		//Zoom out
		js.executeScript("document.body.style.zoom = '40%' ; ");
		
		Thread.sleep(2000);
		//Default
		js.executeScript("document.body.style.zoom = '100%' ; ");
		
		
	}

}
