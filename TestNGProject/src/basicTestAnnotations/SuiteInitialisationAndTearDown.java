package basicTestAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteInitialisationAndTearDown {
	
	@BeforeSuite
	public void suiteInitialization() {
		
		System.out.println("Start services");
		System.out.println("Delete old log files");
		System.out.println("Deploy game");
		System.out.println("Report Initialization");
	}
	
	@AfterSuite
	public void suiteTearDown() {
		
		System.out.println("Close reports");
	}

}
