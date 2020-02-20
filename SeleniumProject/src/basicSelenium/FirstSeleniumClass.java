package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver(); //Constructor gets called when a object is created
	dr.manage().window().maximize(); // to maximize the window
	dr.get("https://www.google.com/"); // to open the URL
	
	
	
	
	
	
}

	public FirstSeleniumClass()
	{
		System.out.println("Tetsing constructor");
	}


}
