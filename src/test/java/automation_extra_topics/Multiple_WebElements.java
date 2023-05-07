package automation_extra_topics;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Multiple_WebElements {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public SoftAssert softassert;

	@Test(priority = 1)
	public void bbcNewsChannel() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		List<WebElement> BBCLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links in BBC.com website are : " + BBCLinks.size());

		// let's say we want the 101st link out of the 300
		WebElement Link101 = BBCLinks.get(100);

		// find the name of this Link101 or the text
		System.out.println(Link101.getText());

		// want to determine the url of Link101
		System.out.println(Link101.getAttribute("href"));

		// determine the coordinates of Link101
		System.out.println(Link101.getLocation().x + "-----" + Link101.getLocation().y);

		// Want to click on Link101
		// Link101.click();

		// print all the links in the output console
		for (int i = 0; i < BBCLinks.size(); i++) {
			WebElement Links = BBCLinks.get(i);
			System.out.println(Links.getText() + "---------------->" + Links.isDisplayed());
		}

		driver.quit();
	}

	@Test(priority = 2)
	public void flipkartTest() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prop = new Properties();
		ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\automation_extra_topics\\config.properties");
		prop.load(ip);
		driver.get(prop.getProperty("flipkartUrl"));
		// div[@class = '_2WkVRV'] - this represents 40 Formal Shirts
		List<WebElement> formalShirts = driver.findElements(By.xpath("//div[@class = '_2WkVRV']"));
		System.out.println("Total formal shirts in this page is : " + formalShirts.size());

		// div[@class = '_30jeq3'] - this represents prices of each of the formal shirts
		List<WebElement> pricesFormalShirts = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
		System.out.println("Total prices in this page is : " + pricesFormalShirts.size());

		// div[@class = '_3Ay6Sb'] - this represents discount percentage of almost 40
		// Formal Shirts
		List<WebElement> discountPercentageFormalShirts = driver.findElements(By.xpath("//div[@class = '_3Ay6Sb']"));
		System.out.println("Total prices in this page is : " + discountPercentageFormalShirts.size());

		for (int i = 0; i < formalShirts.size(); i++) {
			System.out.println(formalShirts.get(i).getText() + "---->" + pricesFormalShirts.get(i).getText() + "---->"
					+ discountPercentageFormalShirts.get(i).getText());
		}

		driver.quit();
	}

	@Test(priority = 3) //staleElementReferenceException
	public void rediffFooterLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		// div[@class = 'footer alignC']/a
		// div.footer.alignC > a
		List<WebElement> rediffFooterLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));

		for (int i = 0; i < rediffFooterLinks.size(); i++) {
			System.out.println(rediffFooterLinks.get(i).getText());
			String url = rediffFooterLinks.get(i).getAttribute("href");
			System.out.println(url);

			System.out.println("----------------------------------------------------");

			rediffFooterLinks.get(i).click();
			System.out.println("Title of this page is : " + driver.getTitle());
			driver.get("https://rediff.com");
			rediffFooterLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));

		}

		driver.quit();
	}
	
	@Test(priority = 4)
	public void bbcHeaderLinks() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		//nav.orbit-header-links.international >ul > li
		
		List<WebElement> BBCHeaderLinks = driver.findElements(By.cssSelector("nav.orbit-header-links.international >ul > li"));
		System.out.println(BBCHeaderLinks.size());
		
		for(int i=0 ; i<BBCHeaderLinks.size(); i++) {
			System.out.println(BBCHeaderLinks.get(i).getText()+"---->"+BBCHeaderLinks.get(i).isDisplayed());
			String url = BBCHeaderLinks.get(i).getAttribute("href");
			System.out.println(url);
			softassert = new SoftAssert();
			boolean result = validateResponseCode(url);
			softassert.assertTrue(result, "invalid response code");
			System.out.println("--------------------------------------------------------------------------------");
			
			BBCHeaderLinks.get(i).click();
			System.out.println("Title of this page is : " + driver.getTitle());
			driver.get("https://bbc.com");
			BBCHeaderLinks = driver.findElements(By.cssSelector("nav.orbit-header-links.international >ul > li"));
			
			}
		softassert.assertAll();
		driver.quit();
	}
	
	public boolean validateResponseCode(String url) throws Exception, Exception {
		int responsecode = 0;
		responsecode = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response code for the url : " + url + "is -->" + responsecode ) ;
		if(responsecode == 200) {
			return true;
		} else {
			return false;
		}
	}

}
