package automation_extra_topics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//working in a company
//under a pipeline
//Dev > QA > UAT > Prod
//you will be working in lot of different builds

//add 2 maven dependencies
//1. fluent-hc
//2. commons-io

public class ResponseCode {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void determineResponseCode() throws Exception, IOException {
		options = new ChromeOptions();
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\automation_extra_topics\\config.properties");
		prop.load(ip);
		
		int responsecode = Request.Get(prop.getProperty("urlQA1")).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("The status code of rediff is : " + responsecode);
		
		if(responsecode == 200) {
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://rediff.com");
			
		}else {
			System.out.println("response code is not 200");
		}
		
	}
}
