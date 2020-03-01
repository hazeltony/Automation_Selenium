package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("file://C:/Users/hazeltony/Downloads/Practice.html");
		
		dr.findElement(By.xpath("//input[@id='Anand_file']")).click();

	}

}
