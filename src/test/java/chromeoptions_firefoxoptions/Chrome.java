package chromeoptions_firefoxoptions;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class Chrome {

	public WebDriver driver;

	@Test(priority = 1)
	public void leaningChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		// options.setPageLoadStrategy(PageLoadStrategy.NONE);
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");

	}

	@Test(priority = 2)
	public void learnFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();

		// Firefox Profiling
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile prof = new FirefoxProfile();
		options.setProfile(prof);
		options.addArguments("-private"); // enable incognito mode

		options.addPreference("browser.tabs.remote.autostart", false); // disable infobar

		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://amazon.com");

	}

}
