package basicTestAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {
		
	
	@Test(priority =0)
	public void test3(){
		
		System.out.println("Test case 3");
		
	}
		
		@Test(priority=1)
		public void test1(){
			
			System.out.println("Test case 1");
			
		}

		@Test(priority=2)
		public void test2(){
			
			System.out.println("Test case 2");
		}
			
			@BeforeClass
			public void beforeClass() {
				
				System.out.println("Pre conditions for FirstTestNGClass");
			}
			
			@AfterClass
			public void afterClass() {
				
				System.out.println("Post conditions for FirstTestNGClass");
			}
			
			@BeforeMethod
			public void beforeMethod() {
				
				System.out.println("Pre condition for every test case");
			}
			@AfterMethod
			public void afterMethod() {
				
				System.out.println("Post condition for every test case");
			}
		
	}

