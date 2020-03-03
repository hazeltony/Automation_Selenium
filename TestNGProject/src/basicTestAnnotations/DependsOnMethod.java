package basicTestAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod  extends TestInitialisationAndTearDown{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Pre conditions for DependsOnMethod class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Post conditions for DependsOnMethod class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Pre condition for every test case");
	}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Post condition for every test case");
	}
	

	@Test
	public void login(){
		
		System.out.println("Login");
		System.out.println(10/0);
	}
		
		@Test(dependsOnMethods = {"login"})
		public void verifyHomepage(){
			
			System.out.println("Verify Homepage");
			
			
		}

		@Test(dependsOnMethods = {"login","verifyHomepage"})
		public void logout(){
			
			System.out.println("Logout");
		}
}
