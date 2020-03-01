package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("file:///C:/Users/hazeltony/Downloads/Practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		
		WebElement ele = dr.findElement(By.tagName("button"));
		
		//Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView();", ele); //to scroll till you find the element
		
		ele.click();
		
		Alert alt =dr.switchTo().alert(); //to deal with alerts
		
		System.out.println(alt.getText());
		
		Thread.sleep(2000);
		//alt.accept();
		alt.dismiss();

	}

}
