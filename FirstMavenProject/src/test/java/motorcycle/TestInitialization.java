package motorcycle;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInitialization {
	@BeforeTest
	public void automobileTestInitialization() {
		
		System.out.println("Execute pre-conditions of automobile module");
	}
	
	@AfterTest
	public void automobileTeardown() {
		
		System.out.println("Revert back the changes made in initialization part");
	}

}
