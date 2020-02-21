package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelements {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("http://sampleapp.tricentis.com/101/"); 
		
		//WebElement automobile =dr.findElement(By.id("nav_automobile")); //-->>ID
//static function gets called by classname. BY is the classname, findelement is the function with returntype webelement
	  //int add =BasicWebelements.sum(10,20); example for above line
		//WebElement automobile =dr.findElement(By.name("Navigation Automobile")); // -->>NAME
		
		//WebElement automobile =dr.findElement(By.linkText("Automobile")); // -->>LINKTEXT
		
		//WebElement automobile =dr.findElement(By.partialLinkText("tomobile")); //-->>PARTIALLINKTEXT
		//WebElement automobile =dr.findElement(By.xpath("//a[@id='nav_automobile']")); //-->>XPATH
		WebElement automobile =dr.findElement(By.cssSelector("a#nav_automobile")); //-->>CSSSELECTOR
		
		String actual = automobile.getText();
		System.out.println(actual);
		
		
		automobile.click();
		 
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		

	}
	/*
	 * public static int sum (int a , int b) { return a+b; }
	 */

}
