package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleCalender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("http://sampleapp.tricentis.com/101/"); 
		
		WebElement automobile =dr.findElement(By.cssSelector("a#nav_automobile"));
		automobile.click();
		
		//Select make
		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Porsche");
		
		//Enter Engine Performance
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		
		//Select date of manufacture
		//dr.findElement(By.id("dateofmanufacture")).sendKeys("02/24/2020");
		
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.id("opendateofmanufacturecalender"))).build().perform();
		
		dr.findElement(By.id("opendateofmanufacturecalender")).click();
		
		//get current month and year
		String targetYear ="2020";
		String targetmonth = "July";
		String targetDate ="10";
		
		String month =dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year =dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		System.out.println(month);
		System.out.println(year);
		
		while(!dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals(targetmonth))
		dr.findElement(By.xpath("//a[@title='Prev']")).click();
		
		
		int rows = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
		
		System.out.println("number of rows=" +rows);
		
		/*int cols = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a")).size();
		
		System.out.println("number of columns=" +cols);*/
		
		for(int r=1; r<=rows;r++)
			
		{
			int cols = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td")).size();
			//System.out.println("number of columns=" +cols);
			
			for(int c=1; c<=cols; c++)
			{
				WebElement dateText =dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td["+c+"]"));
				
				if(dateText.getText().contentEquals(targetDate))
				{
					dateText.click();
				}
			}
			
		
		}

	}

}
