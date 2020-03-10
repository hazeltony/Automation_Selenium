package basicTestAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	
	@Test
	@Parameters({"username","password"})
	public void test1(String username1, String password1) {
		
		System.out.println("Enter "+username1+" in username field" );
		System.out.println("Enter "+password1+"  in password field");
		
		
	}

}
