package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("hazeltony21@yahoo.com");
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("zahruncrinkle@216");
		//dr.findElement(By.linkText("Forgotten account?")).click();
		
		dr.findElement(By.xpath("//input[@id='u_0_2']")).click();
		 		

	}

}
