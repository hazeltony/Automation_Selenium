package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

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
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/24/2020");
		
		//Select number of seats
		Select  seat = new Select(dr.findElement(By.id("numberofseats")));
		seat.selectByValue("4");
	   
		//Select fuel type
		Select fuel= new Select(dr.findElement(By.id("fuel")));
		fuel.selectByValue("Electric Power");
		
		//listprice
		dr.findElement(By.id("listprice")).sendKeys("100000");
		
		//licensenumber
		dr.findElement(By.id("licenseplatenumber")).sendKeys("KBR 210");
		
		//Annual mileage
		dr.findElement(By.id("annualmileage")).sendKeys("250");
		
		//click next
		dr.findElement(By.id("nextenterinsurantdata")).click();
	  
	  

	}

}
