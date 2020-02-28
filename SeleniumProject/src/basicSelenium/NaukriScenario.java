package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriScenario {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("https://www.naukri.com/");
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Thread.sleep(6000);
		
		//dr.findElement(By.xpath("//span[@class='fr geoLocBtn later']")).click();
		
		//dr.findElement(By.xpath("//a[@title='Search Recruiters']/div[@class='mTxt']")).click();
		
		String parent = dr.getWindowHandle();
		
		Set<String> wins =dr.getWindowHandles();
		
for(String w:wins)
			
		{
			if(!w.equals(parent))
					dr.switchTo().window(w);
				dr.close();
		}

		/*
		 * dr.findElement(By.xpath("//div[@class='inpWrap']/input[@class='sugInp']")).
		 * sendKeys("Tester");
		 * 
		 * dr.close();
		 */
		
		
		
		

	}

}
