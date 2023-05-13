package automation_extra_topics_May6th_7th;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BraveBrowser {

	public WebDriver driver;
	public ChromeOptions options;

	@Test
	public void codeInBraveBrowser() throws Exception {
		options = new ChromeOptions();
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\automation_extra_topics\\config.properties");
		prop.load(ip);
		options.setBinary(prop.getProperty("path"));
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
	}

}
