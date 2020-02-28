package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartScenario {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("https://www.flipkart.com/");
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click(); //to close the login pop-up window
		
		Actions act = new Actions(dr);
		WebElement ele = dr.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(ele).build().perform(); // to hover the mouse on the element
		
		ele = dr.findElement(By.xpath("//a[text()='Shirts']")); //click shirts
		ele.click();
		
		Thread.sleep(2000);
		
		ele=dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")); //drag and drop action with mouse
		act.dragAndDropBy(ele, 100, 0).build().perform();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click(); //first shirt element
		
		String parent = dr.getWindowHandle(); // provides this particular window
		
		Set<String> wins =dr.getWindowHandles(); //provides all the windows
		
		
		for(String w:wins)
			
		{
			if(!w.equals(parent))
					dr.switchTo().window(w);
		}
		
		System.out.println(dr.findElements(By.xpath("//div[text()='Available offers']")).size()); //provides the no of elements in that window
		
		dr.close();
		
		dr.switchTo().window(parent);
		
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();

	}

}
