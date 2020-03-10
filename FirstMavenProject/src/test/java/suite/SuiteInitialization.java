package suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteInitialization {

	public static WebDriver dr;
	@BeforeSuite
	public void suiteInitialization() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver(); 
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
	}
	
	@AfterSuite
	public void suiteTearDown() {
		
		System.out.println("Close reports");
	}
}
