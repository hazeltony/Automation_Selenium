package automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 
public class EnterInsurantData extends TestInitialization {
	
	
	
	@Test
	public void firstname() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver(); 
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
	}
	@Test
	public void lastname() {
		
		System.out.println("Enter last name");
	}
	@Test
	public void dob() {
		
		System.out.println("Enter Date of Birth"); }
		
		@BeforeClass
		public void beforeClass() {
			
			System.out.println("Pre conditions for DependsOnMethod Insurant class");
		}
		
		@AfterClass
		public void afterClass() {
			
			System.out.println("Post conditions for DependsOnMethod Insurant class");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			
			System.out.println("Pre condition for every test  Insurant case");
		}
		@AfterMethod
		public void afterMethod() {
			
			System.out.println("Post condition for every test Insurant case");
		}
	}


