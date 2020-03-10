package automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import suite.SuiteInitialization;

public class TestInitialization extends SuiteInitialization {
	
	
	@BeforeTest
	public void automobileTestInitialization() {
		
		
	}
	
	@AfterTest
	public void automobileTeardown() {
		
		System.out.println("Revert back the changes made in initialization part");
	}

}
