package basicTestAnnotations;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnDataProvider {
	
	@BeforeClass
	@Parameters({"browsers"})
	public void initialize(String browser) {
		
		System.out.println("Open "+browser+" browser");
	}

	@Test(dataProvider = "getData")
	public void test1(String username1, String password1) {
		
		System.out.println("Enter "+username1+" in username field" );
		System.out.println("Enter "+password1+"  in password field");
}
	//(enabled=fasle)
	@Test(enabled = false)
	public void test2() {
		
		System.out.println("Test case 2");
	}
	
	@DataProvider
	public String[][] getData(){
		
		String[][] data= new String[4][2];
		
		//Row1
		data[0][0] = "useranme1";
		data[0][1] ="Password1";
		
		//Row2
		data[1][0] = "useranme2";
		data[1][1] ="Password2";
		
		//Row3
		data[2][0] = "useranme3";
		data[2][1] ="Password3";
		
		//Row4
		data[3][0] = "useranme4";
		data[3][1] ="Password4";
		
		return data;
		
	}
}
