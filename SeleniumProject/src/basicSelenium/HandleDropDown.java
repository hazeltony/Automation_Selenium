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
		
		//enter firstname
		dr.findElement(By.id("firstname")).sendKeys("Hazel");
		
		//enter lastname 
		dr.findElement(By.id("lastname")).sendKeys("Tony");
		
		//Dateof birth
		dr.findElement(By.id("birthdate")).sendKeys("11/21/1993");
		
		//Check before click
		System.out.println(dr.findElement(By.xpath("//label[text()='Female']/input")).isSelected());
		//enter gender
		//dr.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click(); //xpath using occurence
		dr.findElement(By.xpath("//label[text()='Female']/span")).click(); //xpath using multiple labels
		
		System.out.println(dr.findElement(By.xpath("//label[text()='Female']/input")).isSelected()); //to check if it is selected
		
		//enter street address
		dr.findElement(By.id("streetaddress")).sendKeys("Palm Atlaantis, B-901");
		
		//Select Country 
		Select place = new Select(dr.findElement(By.id("country")));
		place.selectByValue("India");
		
		//Enter zipcode
		dr.findElement(By.id("zipcode")).sendKeys("412207");
		
		//Enter City
		dr.findElement(By.id("city")).sendKeys("Pune");
		
		//Select Occupation
		Select job = new Select(dr.findElement(By.id("occupation")));
		job.selectByValue("Employee");
		
		//Select Hobbies
		dr.findElement(By.xpath("//label[contains(.,'diving')]/span")).click(); //xpath hsing contains
		
		//Enter Website
		dr.findElement(By.id("website")).sendKeys("www.google.com");
		
		
		//Select Picture
	  
		
		//click next 
		//dr.findElement(By.id("nextenterproductdata")).click();
		
		//Start date
		//dr.findElement(By.id("startdate")).sendKeys("02/25/2020");
		
		//Select insurance sum
		//Select insur = new Select(dr.findElement(By.id("insurancesum")));
		//insur.selectByValue("10000000");
		
		//Select Merit rating
		
		

	}

}
